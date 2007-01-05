/* ViewSerializer
 *
 * Created November 1998 by Joseph Makuch
 *
 * copyright.
 *
 *
 */

package OME;

import java.util.Iterator;

/** The interface that view serializations must implement. */
interface ViewSerializer {

    /** Clears the kb of all objects stored for this view. */
    public void clear();

    /** Returns all serialized objects. */
    public Iterator iterator();

    /** Serialize adds the object to this serializer. The
     * name that is actually stored may be different, probably mangled with
     * the name of the view for uniqueness purposes. */
    public Object serialize(Object victim);
    
}





