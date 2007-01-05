package OME;
import java.util.Collection;
import java.util.Iterator;

/** Contains several methods to be used for collections we shall use.
 *  All these methods throw exceptions and thus all collections that
 *  subclass this class should overide the appropriate methods.
 */
class PessimisticCollection implements Collection {
   
    /** Adds an object to the collection. 
     *
     *  @param o	the object to be added
     */
    public boolean add(Object o) { 
	throw new UnsupportedOperationException(); 
    }


    /** Adds all objects specified in a collection.
     *
     *  @param c the collection containing the objects to be added
     */
    public boolean addAll(Collection c) { 
	throw new UnsupportedOperationException(); 
    }


    /** Clear the collection. */
    public void clear() { 
	throw new UnsupportedOperationException(); 
    }


    /** Returns whether an object exist in the collection. 
     *
     *  @param o the object we are searching for.
     */
    public boolean contains(Object o) { 
	throw new UnsupportedOperationException(); 
    }


    /** Returns whether all objects specified exist in the collection.
     *
     *  @param the collection containing the objects we are searching for 
     */
    public boolean containsAll(Collection c) { 
	throw new UnsupportedOperationException(); 
    }


    /** Joe please comment
     *
     *  @param o Joe please comment
     */
    public boolean equals(Object o) { 
	throw new UnsupportedOperationException(); 
    }


    /** Joe please comment */
    public int hashcode() { 
	throw new UnsupportedOperationException(); 
    }


    /** Returns whether the collection is empty or not */
    public boolean isEmpty() { 
	throw new UnsupportedOperationException(); 
    }


    /** Joe please comment */
    public Iterator iterator() { 
	throw new UnsupportedOperationException(); 
    }


    /** Removes an object from the collection. 
     *
     *  @param o the object to be removed
     */
    public boolean remove(Object o) { 
	throw new UnsupportedOperationException(); 
    }


    /** Removes all objects specified from the collection.
     *
     *  @param c the collection containing the objects to be removed
     */
    public boolean removeAll(Collection c) { 
	throw new UnsupportedOperationException(); 
    }

    /** Joe please comment */
    public boolean retainAll(Collection c) { 
	throw new UnsupportedOperationException(); 
    }


    /** Returns the number of objects in the collection. */
    public int size() { 
	throw new UnsupportedOperationException(); 
    }


    /** Returns an array containing the objects in the collection. */
    public Object[] toArray() { 
	throw new UnsupportedOperationException(); 
    }


    /** Joe please comment */
    public Object[] toArray(Object[] a) { 
	throw new UnsupportedOperationException(); 
    }
    
    
}





