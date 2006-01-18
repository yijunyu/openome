<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:visio="http://schemas.microsoft.com/visio/2003/core" 
        xmlns="http://schemas.microsoft.com/visio/2003/core" 
        >	
<xsl:output method="text"/>
<xsl:template match="/">
    <xsl:for-each select="./visio:VisioDocument/visio:Pages/visio:Page">
       <xsl:variable name="page" select="@ID"/>
       <xsl:for-each select="visio:Shapes/visio:Shape">
        <xsl:variable name="id" select="@ID"/>
        <xsl:variable name="is_link" select="count(../../visio:Connects/visio:Connect[@FromSheet = $id]) &gt; 1"/>
        <xsl:variable name="is_label" select="count(../../visio:Connects/visio:Connect[@FromSheet = $id]) = 1"/>
        <xsl:variable name="record.class">edu.toronto.cs.ome.OME.GraphicView$GVLRecord</xsl:variable>
        <xsl:variable name="highlight">0</xsl:variable>
        <xsl:variable name="expanded" select="0"/>
        <xsl:variable name="hidden" select="0"/>
        <xsl:variable name="scale" select="1.0"/>
        <xsl:variable name="objecttype">
	    <xsl:choose>
		<xsl:when test="$is_link">0</xsl:when>
		<xsl:otherwise>1</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
        <xsl:variable name="justification">
	    <xsl:choose>
		<xsl:when test="$is_link">2</xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="x">
	    <xsl:choose>
		<xsl:when test="$is_link">0</xsl:when>
		<xsl:otherwise><xsl:value-of select="round(72 * visio:XForm/visio:PinX)"/></xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="y">
	    <xsl:choose>
		<xsl:when test="$is_link">0</xsl:when>
		<xsl:otherwise><xsl:value-of select="round((-72) * ((visio:XForm/visio:PinY) - 15))"/></xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="end1x">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round(72 * visio:XForm/visio:PinX)"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="end1y">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round((-72) * ((visio:XForm/visio:PinY) - 15))"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="start2x" select="$end1x"/>
	<xsl:variable name="start2y" select="$end1y"/>
	<xsl:variable name="control1x">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round(72 * (visio:XForm1D/visio:BeginX))"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="control1y">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round((-72) * ((visio:XForm1D/visio:BeginY) - 15))"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="control2x">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round(72 * (visio:XForm1D/visio:EndX))"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:variable name="control2y">
	    <xsl:choose>
		<xsl:when test="$is_link"><xsl:value-of select="round((-72) * ((visio:XForm1D/visio:EndY) - 15))"/></xsl:when>
		<xsl:otherwise>0</xsl:otherwise>
	    </xsl:choose>
	</xsl:variable>
	<xsl:choose>
		<xsl:when test="$is_label">
		</xsl:when>
	    <xsl:otherwise>
	    <xsl:text>Token SerializedViewObject_0_</xsl:text><xsl:value-of select="position()-1"/><xsl:text>&#10;</xsl:text>
        <xsl:text>    IN SerializedObject&#10;</xsl:text>
        <xsl:text>    WITH&#10;</xsl:text>
        <xsl:text>        attribute, type&#10;</xsl:text>
        <xsl:text>             : "</xsl:text><xsl:value-of select="$record.class"/><xsl:text>"&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           ID : </xsl:text><xsl:value-of select="$id"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           objecttype : </xsl:text><xsl:value-of select="$objecttype"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           x : </xsl:text><xsl:value-of select="$x"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           y : </xsl:text><xsl:value-of select="$y"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           expanded : </xsl:text><xsl:value-of select="$expanded"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           hidden : </xsl:text><xsl:value-of select="$hidden"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           highlight : </xsl:text><xsl:value-of select="$highlight"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           end1x : </xsl:text><xsl:value-of select="$end1x"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           end1y : </xsl:text><xsl:value-of select="$end1y"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           start2x : </xsl:text><xsl:value-of select="$start2x"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           start2y : </xsl:text><xsl:value-of select="$start2y"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           control1x : </xsl:text><xsl:value-of select="$control1x"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           control1y : </xsl:text><xsl:value-of select="$control1y"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           control2x : </xsl:text><xsl:value-of select="$control2x"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           control2y : </xsl:text><xsl:value-of select="$control2y"/><xsl:text>&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           scale : </xsl:text><xsl:text>1.0&#10;</xsl:text>
        <xsl:text>        attribute&#10;</xsl:text>
        <xsl:text>           justification : </xsl:text><xsl:value-of select="$justification"/><xsl:text>&#10;</xsl:text>
        <xsl:text>END&#10;&#10;</xsl:text>
       </xsl:otherwise>
	  </xsl:choose>
    </xsl:for-each>
    <xsl:for-each select="visio:Shapes/visio:Shape">
       <xsl:variable name="id" select="@ID"/>
       
       
       <xsl:variable name="master" select="@Master"/>
       <xsl:variable name="type">
           <xsl:choose>
			  <xsl:when test="string-length($master)>0">
			  <xsl:value-of select="../../../../visio:Masters/visio:Master[$master=@ID]/@Name"/>
			  </xsl:when>
			  <xsl:otherwise>
              <xsl:value-of select="substring-before(@NameU, '.')"/>			
			  </xsl:otherwise>							
		   </xsl:choose>       
		</xsl:variable>			
       <xsl:variable name="name" select="visio:Text/text()"/>
       <xsl:variable name="is_link" select="count(../../visio:Connects/visio:Connect[@FromSheet = $id]) &gt; 1"/>
       <xsl:variable name="is_label" select="count(../../visio:Connects/visio:Connect[@FromSheet = $id]) = 1"/>      
       <xsl:choose>
		   <xsl:when test="$is_label">
		   </xsl:when>
	       <xsl:otherwise>
	  <!--xsl:if test="$type"-->
       <xsl:text>Token </xsl:text>
       <xsl:choose>
		<xsl:when test="$is_link">
			<xsl:text>Link</xsl:text>
		</xsl:when>
		<xsl:otherwise>
			<xsl:text>Element</xsl:text>
		</xsl:otherwise>
	</xsl:choose>
	  <xsl:text>_</xsl:text><xsl:value-of select="$id"/><xsl:text>&#10;</xsl:text>
              <xsl:text>    IN IStar</xsl:text><xsl:value-of select="$type"/>
       <xsl:choose>
         <xsl:when test="$is_link">
		<xsl:variable name="to" select="../../visio:Connects/visio:Connect[@FromSheet = $id and @FromCell = 'EndX']/@ToSheet"/>
		<xsl:variable name="from" select="../../visio:Connects/visio:Connect[@FromSheet = $id and @FromCell = 'BeginX']/@ToSheet"/>
		<xsl:choose>
			<xsl:when test="starts-with($type, 'Break') or starts-with($type, 'Make') or starts-with($type, 'Or') or starts-with($type, 'And') or starts-with($type, 'Hurt') or starts-with($type, 'Help') or starts-with($type, 'Unknown') or starts-with($type, 'SomePositive') or starts-with($type, 'SomeNegative')">
            <xsl:text>Contribution</xsl:text> 			
			</xsl:when>
			<xsl:otherwise>
			<xsl:text>Link</xsl:text>
			</xsl:otherwise>
		</xsl:choose>		
		<xsl:text>&#10;</xsl:text>
                <xsl:text>    WITH&#10;</xsl:text>
          	<xsl:text>        attribute, to&#10;</xsl:text>
		<xsl:text>             to : Element_</xsl:text><xsl:value-of select="$to"/><xsl:text>&#10;</xsl:text> 
          	<xsl:text>        attribute, from&#10;</xsl:text>
		<xsl:text>             from : Element_</xsl:text><xsl:value-of select="$from"/><xsl:text>&#10;</xsl:text> 
		<xsl:text>        attribute, name&#10;</xsl:text>
		<xsl:choose>
			<xsl:when test="starts-with($type, 'Break')">
			<xsl:text>             : "Break"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Make')">
			<xsl:text>             : "Make"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'And')">
			<xsl:text>             : "And"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Or')">
			<xsl:text>             : "Or"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Hurt')">
			<xsl:text>             : "Hurt"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Help')">
			<xsl:text>             : "Help"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'SomePositive')">
			<xsl:text>             : "Some +"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'SomeNegative')">
			<xsl:text>             : "Some -"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Parts')">
			<xsl:text>             : "Is part of"</xsl:text><xsl:text>&#10;</xsl:text>
			</xsl:when>
			<xsl:when test="starts-with($type, 'Occupies') or starts-with($type, 'Covers') or starts-with($type, 'ISA') or starts-with($type, 'INS') or starts-with($type, 'Plays')">
			<xsl:text>             : "</xsl:text><xsl:value-of select="$type"/><xsl:text>"&#10;</xsl:text>
			</xsl:when>
	        <xsl:otherwise>
	        <xsl:text>             : "</xsl:text><xsl:value-of select="$name"/><xsl:text>"&#10;</xsl:text>
	        </xsl:otherwise>	
		</xsl:choose>
		    <xsl:text>END&#10;&#10;</xsl:text>
	 </xsl:when>
	 <xsl:otherwise>
		<xsl:text>Element</xsl:text>
		<xsl:text>&#10;</xsl:text>
		      <xsl:text>    WITH&#10;</xsl:text>
		  <xsl:text>        attribute, name&#10;</xsl:text>
		  <xsl:text>             :"</xsl:text><xsl:value-of select="$name"/><xsl:text>"&#10;</xsl:text>
		  <xsl:variable name="x" select="visio:XForm/visio:PinX"/>		 
		  <xsl:variable name="y" select="visio:XForm/visio:PinY"/>
		  <!--search for parents-->
		  <xsl:for-each select="../../visio:Shapes/visio:Shape">
		       <xsl:variable name="boundaryName" select="@Master"/>
		       <xsl:if test="starts-with($boundaryName, '2')">
		          <xsl:variable name="boundaryID" select="@ID"/>
                  <xsl:variable name="boundX" select="visio:XForm/visio:PinX"/>
                  <xsl:variable name="boundY" select="visio:XForm/visio:PinY"/>
                  <xsl:variable name="boundW" select="visio:XForm/visio:Width"/>
                  <xsl:variable name="boundH" select="visio:XForm/visio:Height"/>
                  <xsl:variable name="bound">
	                            <xsl:choose>
		                        <xsl:when test="$boundW &gt; $boundH"><xsl:value-of select="$boundH"/></xsl:when>
	                        	<xsl:otherwise><xsl:value-of select="$boundW"/></xsl:otherwise>
	                            </xsl:choose>
	              </xsl:variable>
	              <xsl:variable name="radius"><xsl:value-of select="($bound * $bound) div 4"/></xsl:variable>
	              <xsl:variable name="distance"><xsl:value-of select="($x - $boundX) * ($x - $boundX) + ($y - $boundY) * ($y - $boundY)"/></xsl:variable>
	              <xsl:if test="$radius &gt; $distance">
	                                <xsl:variable name="parent" select="../../visio:Connects/visio:Connect[@FromSheet = $boundaryID]/@ToSheet"/>
						            <xsl:text>      attribute, parent&#10;</xsl:text>
		                            <xsl:text>           : Element_</xsl:text><xsl:value-of select="$parent"/><xsl:text>&#10;</xsl:text> 
		          </xsl:if> 
		       </xsl:if>		  
		  </xsl:for-each>
		    <xsl:for-each select="../../visio:Connects/visio:Connect[@ToSheet = $id]">
		    <xsl:variable name="from" select="@FromSheet"/>	
		    <xsl:choose>
				<xsl:when test="count(../../visio:Connects/visio:Connect[@FromSheet = $from]) &gt; 1">
				<xsl:text>      attribute, links&#10;</xsl:text>
		        <xsl:text>           : Link_</xsl:text><xsl:value-of select="$from"/><xsl:text>&#10;</xsl:text>			
			    </xsl:when>
			    <xsl:otherwise>
			       <xsl:variable name="labelMasterID" select="../../visio:Shapes/visio:Shape[@ID = $from]/@Master"/>
			       <xsl:variable name="label" select="../../../../visio:Masters/visio:Master[@ID = $labelMasterID]/@Name"/>
			       <xsl:choose>
				   <xsl:when test="starts-with($label, 'Actor boundary')">
				            <xsl:variable name="boundaryX" select="../../visio:Shapes/visio:Shape[@ID = $from]/visio:XForm/visio:PinX"/>
				             <!--<xsl:text>           x : </xsl:text><xsl:value-of select="$x"/><xsl:text>&#10;</xsl:text>-->
				            <xsl:variable name="boundaryY" select="../../visio:Shapes/visio:Shape[@ID = $from]/visio:XForm/visio:PinY"/>
						    <xsl:variable name="boundaryW" select="../../visio:Shapes/visio:Shape[@ID = $from]/visio:XForm/visio:Width"/>
						    <xsl:variable name="boundaryH" select="../../visio:Shapes/visio:Shape[@ID = $from]/visio:XForm/visio:Height"/>
						    <xsl:variable name="boundary">
	                            <xsl:choose>
		                        <xsl:when test="$boundaryW &gt; $boundaryH"><xsl:value-of select="$boundaryH"/></xsl:when>
	                        	<xsl:otherwise><xsl:value-of select="$boundaryW"/></xsl:otherwise>
	                            </xsl:choose>
	                       </xsl:variable>
	                       <!--search for children-->
						   <xsl:for-each select="../../visio:Shapes/visio:Shape">
						       <xsl:variable name="child" select="@ID"/>
						       <xsl:variable name="childName" select="@Master"/>
						       <xsl:variable name="is_boundary" select="starts-with ($childName, '2')"/>  
						       <xsl:variable name="is_childLinkLabel" select="count(../../visio:Connects/visio:Connect[@FromSheet = $child]) >= 1"/>
						       <xsl:choose>
		                           <xsl:when test="$is_boundary or $is_childLinkLabel">
		                           </xsl:when>
	                           <xsl:otherwise>
						       <xsl:variable name="childX" select="visio:XForm/visio:PinX"/>
						       <xsl:variable name="childY" select="visio:XForm/visio:PinY"/>
						       <xsl:if test="(($boundary * $boundary) div 4) &gt; (($childX - $boundaryX) * ($childX - $boundaryX) + ($childY - $boundaryY) * ($childY - $boundaryY))">
						            <xsl:text>      attribute, children&#10;</xsl:text>
		                            <xsl:text>           : Element_</xsl:text><xsl:value-of select="$child"/><xsl:text>&#10;</xsl:text> 
		                       </xsl:if> 
		                       </xsl:otherwise>
                               </xsl:choose>
		                   </xsl:for-each>	
				   </xsl:when>
				   <xsl:otherwise>
			       <xsl:text>      attribute, label&#10;</xsl:text>
		           <xsl:text>           : IStar</xsl:text><xsl:value-of select="$label"/><xsl:text>ElementLabel&#10;</xsl:text>
		           </xsl:otherwise>	
		           </xsl:choose>
			    </xsl:otherwise>
		   </xsl:choose>		    
		  </xsl:for-each>
      	<xsl:text>END&#10;&#10;</xsl:text>
	 </xsl:otherwise>
	</xsl:choose>
	  <!--/xsl:if-->
	  </xsl:otherwise>
	  </xsl:choose>
    </xsl:for-each>
    <xsl:text>Token SerializedView_</xsl:text><xsl:value-of select="$page"/><xsl:text>&#10;</xsl:text>
        <xsl:text>    IN SerializedView&#10;</xsl:text>
        <xsl:text>    WITH&#10;</xsl:text>
         <xsl:for-each select="visio:Shapes/visio:Shape">
            <xsl:variable name="id" select="@ID"/>
            <xsl:variable name="is_label" select="count(../../visio:Connects/visio:Connect[@FromSheet = $id]) = 1"/>      
            <xsl:choose>
		        <xsl:when test="$is_label">
		        </xsl:when>
	       <xsl:otherwise>
                    <xsl:text>        attribute, view_objects&#10;</xsl:text>
                    <xsl:text>             : SerializedViewObject_</xsl:text><xsl:value-of select="$page"/><xsl:text>_</xsl:text><xsl:value-of select="position()-1"/><xsl:text>&#10;</xsl:text> 
           </xsl:otherwise>
	     </xsl:choose>         
         </xsl:for-each>
        <xsl:text>END&#10;&#10;</xsl:text>
       </xsl:for-each>

   <xsl:text>
SimpleClass IStarAspectElement
    IN IStarActorElementClass, OMEInstantiableClass
    ISA IStarActorElement
    WITH
        attribute, attribute, name
             : "i* Aspect"
        attribute, attribute, imagename
             : "Annotation.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END
SimpleClass IStarRoleElement
    IN IStarActorElementClass, OMEInstantiableClass
    ISA IStarActorElement
    WITH
        attribute, attribute, name
             : "i* Role"
        attribute, attribute, imagename
             : "Role.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END

SimpleClass IStarPositionElement
    IN IStarActorElementClass, OMEInstantiableClass
    ISA IStarActorElement
    WITH
        attribute, attribute, name
             : "i* Position"
        attribute, attribute, imagename
             : "Position.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END

SimpleClass IStarAspectElement
    IN IStarActorElementClass, OMEInstantiableClass
    ISA IStarActorElement
    WITH
        attribute, attribute, name
             : "i* Aspect"
        attribute, attribute, imagename
             : "Annotation.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END

SimpleClass IStarAgentElement
    IN IStarActorElementClass, OMEInstantiableClass
    ISA IStarActorElement
    WITH
        attribute, attribute, name
             : "i* Agent"
        attribute, attribute, imagename
             : "Agent.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END

SimpleClass IStarActorElement
    IN IStarClass, IStarActorElementClass, OMEInstantiableClass
    ISA IStarElement, OMEGrowableElement
    WITH
        attribute
            children : IStarIntentionalElement
        attribute, attribute, name
             : "i* Actor"
        attribute, attribute, imagename
             : "Actor.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 80
END

SimpleClass IStarGoalElement
    IN IStarIntentionalElementClass, OMEInstantiableClass
    ISA IStarIntentionalElement
    WITH
        attribute, attribute, name
             : "i* Goal"
        attribute, attribute, imagename
             : "Goal.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 50
END

SimpleClass IStarTaskElement
    IN IStarIntentionalElementClass, OMEInstantiableClass
    ISA IStarIntentionalElement
    WITH
        attribute, attribute, name
             : "i* Task"
        attribute, attribute, imagename
             : "Task.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 50
END

SimpleClass IStarSoftGoalElement
    IN IStarIntentionalElementClass, OMEInstantiableClass
    ISA IStarIntentionalElement
    WITH
        attribute, attribute, name
             : "i* Softgoal"
        attribute, attribute, imagename
             : "Softgoal.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 50
END

SimpleClass IStarClaimElement
    IN IStarIntentionalElementClass, OMEInstantiableClass
    ISA IStarIntentionalElement, IStarSoftGoalElement
    WITH
        attribute, attribute, name
             : "i* Claim"
        attribute, attribute, imagename
             : "Claim.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 50
END

SimpleClass IStarResourceElement
    IN IStarIntentionalElementClass, OMEInstantiableClass
    ISA IStarIntentionalElement
    WITH
        attribute, attribute, name
             : "i* Resource"
        attribute, attribute, imagename
             : "Resource.gif"
        attribute, attribute, imagesize
            width : 80
        attribute, attribute, imagesize
            height : 50
END

SimpleClass IStarIntentionalElement
    IN IStarClass, OMEElementClass, OMEVisibleClass
    ISA IStarElement
    WITH
        attribute
            parent : IStarActorElement
        attribute, imagesize, attribute
            width : 80
        attribute, imagesize, attribute
            height : 50
        attribute, OMEAttributes
            label : IStarElementLabelClass
END

SimpleClass IStarElement
    IN IStarClass
    ISA OMEElement
    WITH
        attribute
            name : String
END

SimpleClass IStarDependencyLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute, attribute, name
             : "i* Dependency link"
        attribute, attribute, imagename
             : "Dependency.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, OMEAttributes
            label : IStarLinkLabelClass
END

SimpleClass IStarDecompositionLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarTaskElement
        attribute
            from : IStarIntentionalElement
        attribute, attribute, name
             : "i* Decomposition link"
        attribute, attribute, imagename
             : "Decomposition.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, OMEAttributes
            label : IStarLinkLabelClass
END

SimpleClass IStarMeansEndsLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarGoalElement
        attribute
            from : IStarIntentionalElement
        attribute, attribute, name
             : "i* Means-ends link"
        attribute, attribute, imagename
             : "Means-Ends.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, OMEAttributes
            label : IStarLinkLabelClass
END

SimpleClass IStarISALink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarActorElement
        attribute
            from : IStarActorElement
        attribute, attribute, name
             : "i* ISA"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "ISA"
END

SimpleClass IStarINSLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarActorElement
        attribute
            from : IStarActorElement
        attribute, attribute, name
             : "i* INS"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "INS"
END

SimpleClass IStarPlaysLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarRoleElement
        attribute
            from : IStarAgentElement
        attribute, attribute, name
             : "i* Plays"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "PLAYS"
END

SimpleClass IStarOccupiesLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarPositionElement
        attribute
            from : IStarAgentElement
        attribute, attribute, name
             : "i* Occupies"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "OCCUPIES"
END

SimpleClass IStarCoversLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarRoleElement
        attribute
            from : IStarPositionElement
        attribute, attribute, name
             : "i* Covers"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "COVERS"
END

SimpleClass IStarDeniedElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Denied"
        attribute, imagename, attribute, imagename
             : "Cross.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 60
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarWeaklyDeniedElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Weakly Denied"
        attribute, imagename, attribute, imagename
             : "WeaklyDenied.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 60
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarUndecidedElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Undecided"
        attribute, imagename, attribute, imagename
             : "Undecided.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 60
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarWeaklySatisficedElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Weakly Satisficed"
        attribute, imagename, attribute, imagename
             : "WeaklySatisficed.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 60
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarSatisficedElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Satisficed"
        attribute, imagename, attribute, imagename
             : "Check.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 60
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarConflictElementLabel
    IN OMEVisibleClass, IStarElementLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Conflict"
        attribute, imagename, attribute, imagename
             : "Conflict.gif"
        attribute, imagesize, attribute, imagesize
            width : 50
        attribute, imagesize, attribute, imagesize
            height : 50
        attribute, attribute, imageposition
            dx : 55
        attribute, attribute, imageposition
            dy : 0
END

SimpleClass IStarDeniedLinkLabel
    IN OMEVisibleClass, IStarLinkLabelClass
    WITH
        attribute, name, attribute, name
             : "i* Denied Link"
        attribute, imagename, attribute, imagename
             : "Cross.gif"
        attribute, imagesize, attribute, imagesize
            width : 20
        attribute, imagesize, attribute, imagesize
            height : 20
        attribute, attribute, imageposition
            dx : 20
        attribute, attribute, imageposition
            dy : 10
END

SimpleClass IStarPartsLink
    IN IStarLinkClass, OMEInstantiableClass
    ISA IStarLink
    WITH
        attribute
            to : IStarActorElement
        attribute
            from : IStarActorElement
        attribute, attribute, name
             : "i* Is-Part-of"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, defaultname
             : "Is-Part-of"
END

SimpleClass IStarBreakContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Break"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Break"
END

SimpleClass IStarMakeContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Make"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Make"
END

SimpleClass IStarOrContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Or"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Or"
END

SimpleClass IStarAndContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* And"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "And"
END

SimpleClass IStarEqualContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Equal"
        attribute, attribute, imagename
             : "DoubleArrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "="
END

SimpleClass IStarHurtContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Hurt"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Hurt"
END

SimpleClass IStarHelpContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Help"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Help"
END

SimpleClass IStarUnknownContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Unknown"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Unknown"
END

SimpleClass IStarSomePositiveContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Some +"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Some +"
END

SimpleClass IStarSomeNegativeContribution
    IN OMEInstantiableClass, OMELinkClass
    ISA IStarSoftgoalContribution
    WITH
        attribute, attribute, name
             : "i* Some -"
        attribute, attribute, imagename
             : "Arrow.gif"
        attribute, attribute, imagesize
            width : 20
        attribute, attribute, imagesize
            height : 20
        attribute, attribute, defaultname
             : "Some -"
END

SimpleClass IStarSoftgoalContribution
    IN OMEVisibleClass, OMELinkClass
    ISA IStarLink
    WITH
        attribute, name, attribute
             : "IStarSoftgoalContribution"
        attribute, OMEAttributes
            label : IStarLinkLabelClass
END

SimpleClass IStarLink
    ISA OMELink
END

SimpleClass OMEGrowableElement
    IN OMEGrowableElementClass
    ISA OMEElement
    WITH
        attribute
            children : OMEElement
END

SimpleClass OMEElement
    IN OMEElementClass
    ISA OMEObject
    WITH
        attribute
            parent : OMEElement
END

SimpleClass OMELink
    IN OMELinkClass
    ISA OMEObject
    WITH
        attribute
            to : OMEObject
        attribute
            from : OMEObject
END

SimpleClass OMEObject
    IN OMEObjectClass
    WITH
        attribute
            name : String
        attribute
            links : OMELink
        attribute, OMEValueAttributes
            comment : String
END

SimpleClass SerializedView
    WITH
        attribute
            view_objects : Token
END

SimpleClass SerializedObject
    WITH
        attribute
            type : String
END

MetaClass IStarElementLabelClass
    IN OMEAttributeMetaClass
    ISA OMEAttributeClass
END

MetaClass IStarLinkLabelClass
    IN OMEAttributeMetaClass
    ISA OMEAttributeClass
END

MetaClass IStarLinkClass
    ISA IStarClass, OMELinkClass
END

MetaClass IStarActorElementClass
    ISA IStarElementClass
END

MetaClass IStarIntentionalElementClass
    ISA IStarElementClass
END

MetaClass IStarElementClass
    ISA IStarClass, OMEElementClass
END

MetaClass IStarClass
    ISA OMEObjectClass
END

MetaClass IStarContributionLabelClass
    IN OMEAttributeMetaClass
    ISA OMEAttributeClass
END

MetaClass OMEInstantiableClass
    ISA OMEClass, OMEVisibleClass
    WITH
        attribute
            autogui : Integer
END

MetaClass OMEVisibleClass
    ISA OMEClass
    WITH
        attribute
            imagename : String
        attribute
            imagesize : Integer
        attribute
            name : String
END

MetaClass OMEGrowableElementClass
    ISA OMEObjectClass, OMEElementClass
END

MetaClass OMEElementClass
    ISA OMEObjectClass
END

MetaClass OMELinkClass
    ISA OMEObjectClass
    WITH
        attribute
            stroke : String
END

MetaClass OMEObjectClass
    ISA OMEClass
    WITH
        attribute
            OMEAttributes : OMEAttributeMetaClass
        attribute
            defaultname : String
        attribute
            OMEValueAttributes : SClass
END

MetaClass OMEClass
END

MetaClass OMEAttributeClass
    WITH
        attribute
            name : String
        attribute
            imagename : String
        attribute
            imagesize : Integer
        attribute
            imageposition : Integer
END

MetaMetaClass OMEAttributeMetaClass
END
   </xsl:text>

 </xsl:template>
</xsl:stylesheet>
