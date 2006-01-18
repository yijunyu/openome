/* TelosFunctionality.java
 *
 * created october 1998 by Joseph Makuch
 *
 * copyright.
 */

package edu.toronto.cs.ome.model;

/** Contains the Telos names for the OME-framework objects here,
 *  as well as some handy utility-type definitions.
 */
interface TelosFunctionality {
    
    // categories
    public static final String ATTRIBUTE[] = {"attribute"};
    public static final String LINKS[] = {"links"};
    public static final String CHILDREN[] = {"children"};
    public static final String NAMECAT[] = {"name"};
    public static final String NAME[] = {"name"};
    public static final String DEFAULT_NAME[] = {"defaultname"};
    public static final String SATCAT[] = {"sat"};
    public static final String DENCAT[] = {"den"};
    public static final String PERFCAT[] = {"perf"};
    public static final String IMAGE_NAME[] = {"imagename"};
    public static final String IMAGE_SIZE[] = {"imagesize"};
    public static final String VIEW_OBJECTS[] = {"view_objects"};
    public static final String TYPE[] = {"type"};
    public static final String TOCAT[] = {"to"};
    public static final String FROMCAT[] = {"from"};
    public static final String PARENTCAT[] = {"parent"};
    public static final String LABELCAT[] = {"label"};
    public static final String OME_ATTSCAT[] = {"OMEAttributes"};
    public static final String OME_VALUE_ATTSCAT[] = {"OMEValueAttributes"};
    public static final String IMAGE_POSITION[] = {"imageposition"};
    public static final String STROKE[] = {"stroke"};
    public static final String AUTOGUI[] = {"autogui"};
    public static final String COMMENT[] = {"comment"};
    
    // indexing arrays |)
    public static final int FIRST=0;
    
    // labels
    public static final String MATCH_ALL=null;
    public static final String NOLABEL="";
    public static final String TO="to";
    public static final String FROM="from";
    public static final String SAT="sat";
    public static final String DEN="den";
    public static final String IMAGE_WIDTH_LABEL="width";
    public static final String IMAGE_HEIGHT_LABEL="height";
    public static final String IMAGE_X_LABEL="dx";
    public static final String IMAGE_Y_LABEL="dy";
    
    // metaclasses:
    public static final String OME_VISIBLE_CLASS="OMEVisibleClass";
    public static final String OME_INSTANTIABLE_CLASS="OMEInstantiableClass";
    
    // simpleclasses
    public static final String OME_ELEMENT="OMEElement";
    public static final String OME_GROWABLE_ELEMENT="OMEGrowableElement";
    public static final String OME_LINK="OMELink";
    public static final String SERIALIZED_VIEW="SerializedView";
    public static final String SERIALIZED_OBJECT="SerializedObject";
    
}
