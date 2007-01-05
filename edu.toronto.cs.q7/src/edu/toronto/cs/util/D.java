/* D.java 
 *
 * Created October 1998 by Joseph Makuch
 *
 */

package edu.toronto.cs.util;

import java.io.PrintStream;

/**
 * This class serves as a debugging utility. It contains only static methods
 * which can be used for debugging purposes such as printing debugging messages
 * and printing a <code>StackTrace</code> when an <code>Exception</code>
 * occurs.
 */
public class D {
	static PrintStream os;
	static PrintStream er;

//	private static final boolean development = false;
	private static final boolean development = true;
	// Only print debugging output if this is a development version.

	/**
	 * All the methods of this class are static and thus this class should never
	 * be instantiated.
	 */
	public D() {
	}

	public static void o(int n) {
		if (development) {
			checkstreams();
			os.println(""+n);
		}
	}	

	/**
	 * Prints a stacktrace for the specified exception, but does not exit the
	 * program.
	 * 
	 * @param e
	 *            the <code>Exception</code> whose stacktrace should be
	 *            printed out.
	 */
	public static void o(Object e) {
		if (!development) return;
		checkstreams();
		if (e instanceof Exception) {
			os.println(e);
			((Exception)e).printStackTrace(os);
		} else if (e!=null) {
			os.println("" + e);
		}
	}

	/**
	 * Fail when we don't have an exception to dump.
	 * <P>
	 * Currently "failing" does not cause the program to end. This could change
	 * in the future. Once this is done, it makes sense to change the access of
	 * this method from <code>public</code> to <code>private</code>.
	 */
	public static void fail() {
		fail(new Exception());
	}

	/**
	 * Prints a stacktrace of the specified <code>Exception</code>.
	 * <P>
	 * We also would like to take drastic action such as printing a warning
	 * message to exit the program as soon as possible. Currently we don't do
	 * this, but we would like to do this in the future. Probably should use the
	 * <code>JOptionPane.showMessageDialog</code> to output the warning
	 * message. Once this has been done, it makes sense for the access of this
	 * method to be changed from <code>public</code> to <code>private</code>.
	 */
	public static void fail(Exception e) {
		e.printStackTrace();
		// checkstreams();
		// e.printStackTrace(os);
		// e.printStackTrace(er);

		// we should throw up a message box, perhaps in a separate thread,
		// that tells the user:
		//   (1). that a dramatic internal error has occured.
		//   (2). to exit the program as soon as possible.
		//   (3). if important changes to a document have been made since
		//        the last save, that the doc should be saved to a new file.
	}

	/**
	 * Assert the specified boolean is true and otherwise fail.
	 * 
	 * @param b
	 *            the boolean value which we want to assert is true.
	 */
	public static void a(boolean b) {
		if (!b)
			fail();
	}

	/**
	 * Assert the specified long value is non-zero and otherwise fail.
	 * 
	 * @param lng
	 *            the long value which we want to assert is non-zero.
	 */
	public static void a(long lng) {
		if (lng == 0L)
			fail();
	}

	/**
	 * Assert the specified double value is non-zero and otherwise fail.
	 * 
	 * @param dbl
	 *            the double value which we want to assert is non-zero.
	 */
	public static void a(double dbl) {
		if (dbl == 0.0)
			fail();
	}

	/**
	 * Assert the specified reference is non-null and otherwise fail.
	 * 
	 * @param ref
	 *            the reference we want to assert is non-null.
	 */
	public static void a(Object ref) {
		if (ref == null)
			fail();
	}

	/**
	 * Output a stack trace of the specified <code>Exception</code> and then
	 * fail.
	 */
	public static void a(Exception e) {
		if (e == null)
			fail(new Exception());
		else {
			fail(e);
		}
	}

	/**
	 * Assign output and error streams to the obvious choices if they haven't
	 * been set already.
	 */
	private static void checkstreams() {
		if (os == null) {
			os = System.out;
		}
		if (er == null) {
			er = System.err;
		}
	}

}

