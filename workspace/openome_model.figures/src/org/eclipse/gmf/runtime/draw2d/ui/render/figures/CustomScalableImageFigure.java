package org.eclipse.gmf.runtime.draw2d.ui.render.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.internal.mapmode.DiagramMapModeUtil;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderInfo;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.internal.RenderHelper;
import org.eclipse.gmf.runtime.draw2d.ui.render.internal.RenderingListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;

/**
 * An implementation of {@link org.eclipse.draw2d.ImageFigure} that allows
 * scaling the underlying image to the containing Figure's bounds, rather then
 * being fixed to the image size.
 * 
 * <p>
 * Any image that can be implemented inside the RenderedImage interface can be
 * supported.
 * </p>
 * 
 * Much of this code is taken from ScalableImageFigure, but extended
 * to support new functionality specifically for OpenOME such as 
 * changing outline colours etc
 * 
 * @author jcorchis / sshaw / arupghose
 */
public class CustomScalableImageFigure
	extends ScalableImageFigure {

	private RenderingListenerImpl renderingListener = new RenderingListenerImpl();

	private class RenderingListenerImpl
		implements RenderingListener {

		public RenderingListenerImpl() {
			super();
		}

		/* (non-Javadoc)
		 * @see org.eclipse.gmf.runtime.draw2d.ui.render.internal.RenderingListener#paintFigureWhileRendering(org.eclipse.draw2d.Graphics)
		 */
		public void paintFigureWhileRendering(Graphics g) {
			CustomScalableImageFigure.this.paintFigureWhileRendering(g);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gmf.runtime.draw2d.ui.render.RenderingListener#imageRendered(org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage)
		 */
		public void imageRendered(RenderedImage rndImg) {
			if (CustomScalableImageFigure.this.getParent() != null) {
				CustomScalableImageFigure.this.setRenderedImage(rndImg);
				CustomScalableImageFigure.this.repaint();
			}
		}

		/**
		 * @return <code>IFigure</code> that the listener wraps
		 */
		public CustomScalableImageFigure getFigure() {
			return CustomScalableImageFigure.this;
		}
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		public boolean equals(Object obj) {
			if (obj instanceof RenderingListenerImpl) {
				return ((RenderingListenerImpl) obj).getFigure().equals(
					getFigure());
			}

			return false;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#hashCode()
		 */
		public int hashCode() {
			return CustomScalableImageFigure.this.hashCode();
		}

	}
	
	/** Outline colour of the rendered image */
	private RGB outlineColor = null;

	/**
	 * @param img
	 *            the <code>Image</code> to render
	 */
	public CustomScalableImageFigure(Image img) {
		super(img);
		this.outlineColor = null;
	}

	/**
	 * @param renderedImage
	 */
	public CustomScalableImageFigure(RenderedImage renderedImage) {
		this(renderedImage, false, false, true);
	}

	/**
	 * Constructor for meta image sources.
	 * 
	 * @param renderedImage
	 *            the <code>RenderedImage</code> that is used for rendering
	 *            the image.
	 */
	public CustomScalableImageFigure(RenderedImage renderedImage, boolean antiAlias) {
		this(renderedImage, false, false, antiAlias);
	}

	/**
	 * Constructor for meta image sources.
	 * 
	 * @param renderedImage
	 *            the <code>RenderedImage</code> that is used for rendering
	 *            the image.
	 * @param useDefaultImageSize
	 *            <code>boolean</code> indicating whether to initialize the
	 *            preferred size with the default image size. Otherwise, a set
	 *            default will be used instead.
	 * @param useOriginalColors
	 *            <code>boolean</code> indicating whether to use the original
	 *            colors of the <code>RenderedImage</code> or to replace black
	 *            with outline color and white with the fill color.
	 */
	public CustomScalableImageFigure(RenderedImage renderedImage,
			boolean useDefaultImageSize, boolean useOriginalColors,
			boolean antiAlias) {
		super(renderedImage, useDefaultImageSize, useOriginalColors, antiAlias);
		this.outlineColor = null;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	protected void paintFigure(Graphics graphics) {
		Rectangle area = getClientArea().getCopy();
		
        RenderInfo rndInfo = getRenderedImage().getRenderInfo();
        
        // sets the outline color to null if 
        // it hasn't been changed with setOutlineColor(). 
        // if it has, set it to the requested color.        
        RGB oColor;
        if (outlineColor == null) {
        	oColor = null;
        } else {
        	oColor = outlineColor;
        }
        
        rndInfo.setValues(rndInfo.getWidth(), rndInfo.getHeight(),
        		rndInfo.shouldMaintainAspectRatio(), 
                rndInfo.shouldAntiAlias(), 
                getBackgroundColor().getRGB(),
                oColor);
        setRenderedImage(getRenderedImage().getNewRenderedImage(rndInfo));
		
		setRenderedImage(RenderHelper.getInstance(
			DiagramMapModeUtil.getScale(MapModeUtil.getMapMode(this)), false,
			false, null).drawRenderedImage(graphics, getRenderedImage(), area,
			renderingListener));
	}
	
	/**
	 * Sets the outline colour of the figure
	 *
	 * @param rgb the <code>RGB</code> colour to paint the figure's outline
	 * @author arupghose
	 */
	protected void setOutlineColor(RGB rgb) {
		outlineColor = rgb;
	}
	
	/**
	 * @return the <code>RGB</code> that represents the figure's current outline color
	 * @author arupghose
	 */
	protected RGB getOutlineColor() {
		return outlineColor;
	}
}
