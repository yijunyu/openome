
package jtelos.util;

import java.util.*;

import jtelos.Attribute;

public class AttributeVector {

	private Attribute elementData[];
	private int elementCount;
	private int capacityIncrement;

	/**
	 * Constructs an empty AttributeVector. 
	 */
	public AttributeVector() {
		this(10);
	}

	private AttributeVector(int initialCapacity) {
		this(initialCapacity, 0);
	}

	private AttributeVector(int initialCapacity, int capacityIncrement) {
		super();
		this.elementData = new Attribute[initialCapacity];
		this.capacityIncrement = capacityIncrement;
	}

	/**
	 * Adds the specified component to the end of this AttributeVector, 
	 * increasing its size by one. The capacity of this AttributeVector is 
	 * increased if its size becomes greater than its capacity. 
	 *
	 * @param   obj   the component to be added.
	 * @since   JDK1.0
	 */
	public final synchronized void addElement(Attribute obj) {
		ensureCapacity(elementCount + 1);
		elementData[elementCount++] = obj;
	}

	/**
	 * Tests if the specified Attribute is a component in this AttributeVector.
	 *
	 * @param   elem   an Attribute.
	 * @return  <code>true</code> if the specified Attribute is a component in
	 *          this AttributeVector; <code>false</code> otherwise.
	 */
	public final boolean contains(Attribute elem) {
		return indexOf(elem, 0) >= 0;
	}

	/**
	 * Returns the component at the specified index.
	 *
	 * @param      index   an index into this AttributeVector.
	 * @return     the component at the specified index.
	 * @exception  ArrayIndexOutOfBoundsException  if an invalid index was
	 *               given.
	 * @since      JDK1.0
	 */
	public final synchronized Attribute elementAt(int index) {
		if (index >= elementCount) {
			throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
		}
		/* Since try/catch is free, except when the exception is thrown,
		   put in this extra try/catch to catch negative indexes and
		   display a more informative error message.  This might not
		   be appropriate, especially if we have a decent debugging
		   environment - JP. */
		try {
			return elementData[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException(index + " < 0");
		}
	}

	private final synchronized void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			Attribute oldData[] = elementData;
			int newCapacity = (capacityIncrement > 0) ?
				(oldCapacity + capacityIncrement) : (oldCapacity * 2);
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			elementData = new Attribute[newCapacity];
			System.arraycopy(oldData, 0, elementData, 0, elementCount);
		}
	}

	/**
	 * Searches for the first occurence of the given argument, testing 
	 * for equality using the <code>equals</code> method. 
	 *
	 * @param   elem   an Attribute.
	 * @return  the index of the first occurrence of the argument in this
	 *          AttributeVector; returns <code>-1</code> if the Attribute is not found.
	 * @see     java.lang.Object#equals(java.lang.Object)
	 * @since   JDK1.0
	 */
	public final int indexOf(Attribute elem) {
		return indexOf(elem, 0);
	}

	/**
	 * Searches for the first occurence of the given argument, beginning 
	 * the search at <code>index</code>, and testing for equality using 
	 * the <code>equals</code> method. 
	 *
	 * @param   elem    an Attribute.
	 * @param   index   the index to start searching from.
	 * @return  the index of the first occurrence of the Attribute argument in
	 *          this AttributeVector at position <code>index</code> or later in the
	 *          AttributeVector; returns <code>-1</code> if the Attribute is not found.
	 * @see     java.lang.Object#equals(java.lang.Object)
	 * @since   JDK1.0
	 */
	public final synchronized int indexOf(Attribute elem, int index) {
		for (int i = index ; i < elementCount ; i++) {
			if (elem.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Inserts the specified Attribute as a component in this AttributeVector at the 
	 * specified <code>index</code>. Each component in this AttributeVector with 
	 * an index greater or equal to the specified <code>index</code> is 
	 * shifted upward to have an index one greater than the value it had 
	 * previously. 
	 * <p>
	 * The index must be a value greater than or equal to <code>0</code> 
	 * and less than or equal to the current size of the AttributeVector. 
	 *
	 * @param      obj     the component to insert.
	 * @param      index   where to insert the new component.
	 * @exception  ArrayIndexOutOfBoundsException  if the index was invalid.
	 * @see        jtelos.util.AttributeVector#size()
	 * @since      JDK1.0
	 */
	public final synchronized void insertElementAt(Attribute obj, int index) {
		if (index >= elementCount + 1) {
			throw new ArrayIndexOutOfBoundsException(index
													 + " > " + elementCount);
		}
		ensureCapacity(elementCount + 1);
		System.arraycopy(elementData, index, elementData, index + 1, elementCount - index);
		elementData[index] = obj;
		elementCount++;
	}

	/**
	 * Returns the index of the last occurrence of the specified Attribute in
	 * this AttributeVector.
	 *
	 * @param   elem   the desired component.
	 * @return  the index of the last occurrence of the specified Attribute in
	 *          this AttributeVector; returns <code>-1</code> if the Attribute is not found.
	 * @since   JDK1.0
	 */
	public final int lastIndexOf(Attribute elem) {
		return lastIndexOf(elem, elementCount-1);
	}

	/**
	 * Searches backwards for the specified Attribute, starting from the 
	 * specified index, and returns an index to it. 
	 *
	 * @param   elem    the desired component.
	 * @param   index   the index to start searching from.
	 * @return  the index of the last occurrence of the specified Attribute in this
	 *          AttributeVector at position less than <code>index</code> in the AttributeVector;
	 *          <code>-1</code> if the Attribute is not found.
	 * @since   JDK1.0
	 */
	public final synchronized int lastIndexOf(Attribute elem, int index) {
		for (int i = index ; i >= 0 ; i--) {
			if (elem.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Removes all components from this AttributeVector and sets its size to zero.
	 *
	 * @since   JDK1.0
	 */
	public final synchronized void removeAllElements() {
		for (int i = 0; i < elementCount; i++) {
			elementData[i] = null;
		}
		elementCount = 0;
	}

	/**
	 * Removes the first occurrence of the argument from this AttributeVector. If 
	 * the Attribute is found in this AttributeVector, each component in the AttributeVector 
	 * with an index greater or equal to the Attribute's index is shifted 
	 * downward to have an index one smaller than the value it had previously.
	 *
	 * @param   obj   the component to be removed.
	 * @return  <code>true</code> if the argument was a component of this
	 *          AttributeVector; <code>false</code> otherwise.
	 * @since   JDK1.0
	 */
	public final synchronized boolean removeElement(Attribute obj) {
		int i = indexOf(obj);
		if (i >= 0) {
			removeElementAt(i);
			return true;
		}
		return false;
	}

	/**
	 * Deletes the component at the specified index. Each component in 
	 * this AttributeVector with an index greater or equal to the specified 
	 * <code>index</code> is shifted downward to have an index one 
	 * smaller than the value it had previously. 
	 * <p>
	 * The index must be a value greater than or equal to <code>0</code> 
	 * and less than the current size of the AttributeVector. 
	 *
	 * @param      index   the index of the Attribute to remove.
	 * @exception  ArrayIndexOutOfBoundsException  if the index was invalid.
	 * @see        jtelos.util.AttributeVector#size()
	 * @since      JDK1.0
	 */
	public final synchronized void removeElementAt(int index) {
		if (index >= elementCount) {
			throw new ArrayIndexOutOfBoundsException(index + " >= " + 
													 elementCount);
		}
		else if (index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int j = elementCount - index - 1;
		if (j > 0) {
			System.arraycopy(elementData, index + 1, elementData, index, j);
		}
		elementCount--;
		elementData[elementCount] = null; /* to let gc do its work */
	}

	/**
	 * Sets the component at the specified <code>index</code> of this 
	 * AttributeVector to be the specified Attribute. The previous component at that 
	 * position is discarded. 
	 * <p>
	 * The index must be a value greater than or equal to <code>0</code> 
	 * and less than the current size of the AttributeVector. 
	 *
	 * @param      obj     what the component is to be set to.
	 * @param      index   the specified index.
	 * @exception  ArrayIndexOutOfBoundsException  if the index was invalid.
	 * @see        jtelos.util.AttributeVector#size()
	 * @since      JDK1.0
	 */
	public final synchronized void setElementAt(Attribute obj, int index) {
		if (index >= elementCount) {
			throw new ArrayIndexOutOfBoundsException(index + " >= " + 
													 elementCount);
		}
		elementData[index] = obj;
	}

	private final synchronized void setSize(int newSize) {
		if (newSize > elementCount) {
			ensureCapacity(newSize);
		} else {
			for (int i = newSize ; i < elementCount ; i++) {
				elementData[i] = null;
			}
		}
		elementCount = newSize;
	}

	/**
	 * Returns the number of components in this AttributeVector.
	 *
	 * @return  the number of components in this AttributeVector.
	 * @since   JDK1.0
	 */
	public final int size() { return elementCount; }

  public Attribute[] toArray() {
	trimToSize();
	return elementData;
  }  

	private final synchronized void trimToSize() {
		int oldCapacity = elementData.length;
		if (elementCount < oldCapacity) {
			Attribute oldData[] = elementData;
			elementData = new Attribute[elementCount];
			System.arraycopy(oldData, 0, elementData, 0, elementCount);
		}
	}

}