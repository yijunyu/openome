package edu.toronto.cs.ome.view;

import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import edu.toronto.cs.util.D;


/** Generates a simple version of the BMP format. The intention is that most
 *  products that support .BMP files should be able to read it. */
class BMPWriter {
    
    /** Scribbles basic types to a byte stream in <BOLD>Little Endian</BOLD>.
     *  The java library class that resembles this, outputs in big endian,
     *  rendering it useless for saving to intel-type file formats. 
     */
    static class LEWriter {
	FileOutputStream fos;
	public LEWriter (FileOutputStream fos) {
	    this.fos = fos;
	}


      /** Writes out a byte.
       *  @param b 	the byte to be written out
       */
	public void write(byte b) throws IOException {
	    fos.write(b);
	}


      /** Writes out a short. */
	public void write(short s) throws IOException {
	    fos.write(s & (short)0xff);
	    fos.write(s >> 8);
	}


      /** Writes out an int.*/
	public void write(int i) throws IOException {
	    fos.write(i & 0xff);
	    i >>= 8;
	    fos.write(i & 0xff);
	    i >>= 8;
	    fos.write(i & 0xff);
	    i >>= 8;
	    fos.write(i & 0xff);
	}
    }
    
    /** Creates a new BMPWriter. Not yet implemented. */
    public BMPWriter() {
    }
    
    /** Save an image to a win2.x compatible bmp file. Be sure to name the
     *  with a .bmp extension. 
     */
    static public void  writeUncompressedBMP(Image image, File f, int w, int h) 
	throws IOException {	

	// create the output stream:
	FileOutputStream fos = new FileOutputStream(f);
	LEWriter lew = new LEWriter(fos);
	
	// we write a bmp pre-header:
	/* WORD Filetype;  always "BM" = 0x4d42 
	   DWORD Filesize; whole file in bytes, or zero if uncompressed.
	   WORD Reserved1; always 0.
	   WORD Reserved2; always 0.
	   DWORD BitmapOffset; starting position of image data in bytes. */
	int filesize = 0;
	short res1 = 0;
	short res2 = 0;	
	int offset = 14+12; // data starts
	
	lew.write((byte)0x42); // B
	lew.write((byte)0x4d); // M
	lew.write(filesize);
	lew.write(res1);
	lew.write(res2);
	lew.write(offset);
	
	// we write a Win2.x header. This is identical to the early OS2 bmp.
	/* DWORD size;
	   SHORT width;
	   SHORT height;
	   WORD Planes;
	   WORD BitsPerPixel; */
	int headsize = 12; // only of the win2.x header.
	short width = (short)w;
	short height = (short)h; 
	short planes = (short)1;    // for all bitmaps.
	short bits = (short)24;	
	
	lew.write(headsize);
	lew.write(width);
	lew.write(height);
	lew.write(planes);
	lew.write(bits);
	
	// get the binary info from the image
	D.o("grabbing pixels.");
	PixelGrabber pg = new PixelGrabber(image,0,0,w,h,true);
	try {
	    pg.grabPixels();
	} catch (Exception e) {
	   System.out.println(e);
	}
	int pixels[] = (int []) pg.getPixels();
	D.a(pixels.length == w*h);
	D.o("got pixels.");

	// pad the line to have a multiple of four bytes.
	int pad = (((w*3)%4)==0)?(0):4-((w*3)%4);
	int linesize = w*3+pad;
	byte line[] = new byte[linesize];

	// write the data:
	int linestart=0;
	int linepos=0;
	int pixel=0;
	for (int j=0; j<h; j++) {	    
	    linestart=(h-j-1)*w;
	    linepos=0;
	    for ( int i=0; i<w; i++) {
		pixel=pixels[linestart++];
		line[linepos++] = (byte)(pixel & 0xff);
		pixel >>= 8;
		line[linepos++] = (byte)(pixel & 0xff);
		pixel >>= 8;
		line[linepos++] = (byte)(pixel & 0xff);
	    }
	    fos.write(line);
	}
	
	fos.close();	
	
    }
}
