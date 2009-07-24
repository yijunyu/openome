package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;
import java.util.Iterator;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;

/**
 * @author jenhork
 * 
 * This class holds a queue of elements with labels that need to be propagated.
 * 
 * There is no point in writing a queue from scratch so I'm heavily inspired by this implementation of an array based queue:
 * http://www.java-tips.org/java-se-tips/java.lang/array-based-queue-implementation-in-java.html
 * 
 * This uses a different interface than the default Java Queue, so I've made some adjustments. 
 *
 */
public class LabelQueue implements Queue<IntQualIntentionWrapper> {
	
	private IntQualIntentionWrapper [ ] theArray;
    private int        currentSize;
    private int        front;
    private int        back;
    
    private HashMap map;
    
    private final int maxProp = 5;

    private static final int DEFAULT_CAPACITY = 20;

    public LabelQueue() {
    	theArray = new IntQualIntentionWrapper[ DEFAULT_CAPACITY ];
        clear( );
        map = new HashMap();
    }
    
     @Override
	/**
	 * I don't really need an iterator for this class
	 */
	public Iterator<IntQualIntentionWrapper> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return currentSize;
	}

	@Override
	/**
	 * Add an Intention, if the array is getting full, double the length
	 */
	public boolean offer(IntQualIntentionWrapper arg0) {
		if (!contains(arg0)) {
			Integer count = (Integer) map.get(arg0.getIntention());
			
			if (count == null)
				count = 0;
			
			if (count <= maxProp)  {
				if( currentSize == theArray.length )
		            doubleQueue( );
		        back = increment( back );
		        theArray[ back ] = arg0;
		        currentSize++;
	        	
		        count++;
		        
		        map.put(arg0.getIntention(), count);
	        
	        	return true;
			}
		}
        
        return false;
	}

	@Override
	/**
	 * Look at the head of the queue without removing
	 */
	public IntQualIntentionWrapper peek() {
		if( isEmpty( ) )
            throw new UnderflowException( "ArrayQueue getFront" );
        return theArray[ front ];
	}

	@Override
	/**
	 * Return and remove the head of the queue
	 */
	public IntQualIntentionWrapper poll() {
		//System.out.println(currentSize + " " + front + " " + back);
		if( isEmpty( ) )
            throw new UnderflowException( "ArrayQueue dequeue" );
        currentSize--;
        
        IntQualIntentionWrapper returnValue = theArray[ front ];
        front = increment( front );
        
        //System.out.println(currentSize + " " + front + " " + back);
        
        //System.out.println(returnValue.getIntention().getName());
        
        return returnValue;
	}

	@Override
	public boolean add(IntQualIntentionWrapper e) {
		return offer(e);
	}

	@Override
	public IntQualIntentionWrapper element() {
		return peek();
	}

	@Override
	public IntQualIntentionWrapper remove() {
		return poll();
	}

	@Override
	public boolean addAll(Collection<? extends IntQualIntentionWrapper> c) {
		Iterator<IntQualIntentionWrapper> it = (Iterator<IntQualIntentionWrapper>) c.iterator();
		
		while (it.hasNext())  {
			offer(it.next());
		}
		
		return true;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		currentSize = 0;
        front = 0;
        back = -1;
	}

	@Override
	public boolean contains(Object o) {
		int oldfront = front;
				
   	 	for( int i = 0; i < currentSize; i++, front = increment( front ) )  {
   	 		if (o.equals(theArray[front]))  {
   	 			front = oldfront;
   	 			return true;
   	 		}
   	 	}
   	 	front = oldfront;
		return false;   	 	
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public boolean remove(Object o) {
		if( isEmpty( ) )
            throw new UnderflowException( "ArrayQueue dequeue" );
        currentSize--;

        front = increment( front );
        return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		Iterator<IntQualIntentionWrapper> it = (Iterator<IntQualIntentionWrapper>) c.iterator();
		
		while (it.hasNext())  {
			remove(it.next());
		}
		
		return true;
	}

	@Override
	/**
	 * This is supposed to remove everything except what is in the collection.  I'm not sure why I would ever need it, 
	 * so I won't bother with it for now.
	 */
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
	 * Don't return the actual array, return a copy.  Maybe this is done by default?  Can't remember.
	 */
	public IntQualIntentionWrapper[] toArray() {
		return theArray.clone();
	}

	@Override
	/**
	 * I have no idea what this is supposed to do...
	 */
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * Internal method to increment with wraparound.
     * @param x any index in theArray's range.
     * @return x+1, or 0 if x is at the end of theArray.
     */
    private int increment( int x )
    {
        if( ++x == theArray.length )
            x = 0;
        return x;
    }

    /**
     * Internal method to expand theArray.
     */
    private void doubleQueue( )
    {
    	IntQualIntentionWrapper[ ] newArray;

        newArray = new IntQualIntentionWrapper[ theArray.length * 2 ];

            // Copy elements that are logically in the queue
        for( int i = 0; i < currentSize; i++, front = increment( front ) )
            newArray[ i ] = theArray[ front ];

        theArray = newArray;
        front = 0;
        back = currentSize - 1;
        
    }
        
    public void print() {
    	int oldfront = front;
    	 for( int i = 0; i < currentSize; i++, front = increment( front ) )
             System.out.print(theArray[front].getIntention().getName() + ", ");
    	 
    	 System.out.println("");
    	 
    	 front = oldfront;
    	
    }

	
	
	/**
	 * Exception class for access in empty containers
	 * such as stacks, queues, and priority queues.
	 * @author Mark Allen Weiss
	 */
	public class UnderflowException extends RuntimeException
	{
	    /**
	     * Construct this exception object.
	     * @param message the error message.
	     */
	    public UnderflowException( String message )
	    {
	        super( message );
	    }
	}

}

