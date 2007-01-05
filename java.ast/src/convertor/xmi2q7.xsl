<?xml version='1.0'?>
<!-- $Id: q7.xsl,v 1.3 2005/08/15 15:15:59 yijunsf Exp $
     Example 3 in the XSLT tutorial of CSC408H -->
<xsl:stylesheet version='1.0'
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:req="http://www.cs.toronto.edu/~yijun/requirements"
                xmlns:goalmodel="http://www.cs.toronto.edu/km/goalmodel"
		xmi:version="2.0" 
		xmlns:xmi="http://www.omg.org/XMI" 
                xmlns="http://www.cs.toronto.edu/km/goalmodel"
                >
  <xsl:output method="text"/>
  <xsl:template match="/"> 
      <xsl:for-each select="xmi:XMI/goalmodel:Goal | req:model/req:goal | req:model/req:soft">
      	<xsl:apply-templates select="." mode="decomposition"/>
      </xsl:for-each>
  </xsl:template>
  <xsl:template match="goalmodel:Goal | goal | req:goal | req:soft" mode="decomposition"> 
	<xsl:call-template name="indent">
	   <xsl:with-param name="level" select="count(ancestor::req:goal) + count(ancestor::goal) + count(ancestor::goalmodel:Goal)" />
	</xsl:call-template>
        <xsl:if test="local-name()='goal' or local-name()='Goal' ">
	<xsl:text>"</xsl:text>
		<xsl:call-template name="string-replace">
		   <xsl:with-param name="string" select="@name" />
		   <xsl:with-param name="from">"</xsl:with-param>
		   <xsl:with-param name="to">'</xsl:with-param>
		</xsl:call-template>
	<xsl:text>"</xsl:text>
	</xsl:if>
	<xsl:if test="count(req:goal | req:soft | goal) &gt; 0">
		<xsl:text> {</xsl:text>
		  <xsl:for-each select="req:rule">
		     <xsl:apply-templates select="." mode="decomposition"/>
		  </xsl:for-each>
		  <xsl:for-each select="@type">
			<xsl:choose>
			   <xsl:when test=".='AND'"> &amp;</xsl:when>
			   <xsl:when test=".='OR'"> |</xsl:when>
			</xsl:choose>
			<xsl:text>&#10;</xsl:text>
		  </xsl:for-each>
		  <xsl:for-each select="req:goal | req:soft | goal">
		     <xsl:apply-templates select="." mode="decomposition"/>
		  </xsl:for-each>
		<xsl:call-template name="indent">
		   <xsl:with-param name="level" select="count(ancestor::req:goal| ancestor::req:soft | ancestor::goal) + count(ancestor::goalmodel:Goal)" />
		</xsl:call-template>
		<xsl:text>}</xsl:text>
	</xsl:if>
	<xsl:if test="count(req:rule[@to]) &gt; 0">
	  <xsl:text> =&gt; </xsl:text>
	   <xsl:call-template name="comma_separated_list">
		<xsl:with-param name="list" select="req:*[@to]"/>
		<xsl:with-param name="i" select="1"/>
		<xsl:with-param name="n" select="count(req:rule[@to])"/>
	   </xsl:call-template>
	</xsl:if>
	<xsl:text>&#10;</xsl:text>
  </xsl:template>
   <xsl:template match="req:rule" mode="decomposition"> 
	<xsl:choose>
	   <xsl:when test="@op='AND'"> &amp;</xsl:when>
	   <xsl:when test="@op='OR'"> |</xsl:when>
           <xsl:when test="@op='&amp;' and @op='|'">
		<xsl:value-of select="@op"/>
           </xsl:when>
	</xsl:choose>
	<xsl:text>&#10;</xsl:text>
  </xsl:template>
   <xsl:template match="req:rule" mode="contribution"> 
	<xsl:choose>
	   <xsl:when test="@op='MAKE'">++</xsl:when>
	   <xsl:when test="@op='HELP'">+</xsl:when>
	   <xsl:when test="@op='BREAK'">--</xsl:when>
	   <xsl:when test="@op='HURT'">-</xsl:when>
         <xsl:when test="@op='++' or @op='+' or @op='-' or @op='--'">
		<xsl:value-of select="@op"/>
         </xsl:when>
	</xsl:choose>
	<xsl:if test="@to">
           <xsl:text>"</xsl:text>
	   <xsl:value-of select="@to"/>
           <xsl:text>"</xsl:text>
        </xsl:if>
  </xsl:template>
  <xsl:template name="comma_separated_list">
    <xsl:param name="list"/>
    <xsl:param name="i"/>
    <xsl:param name="n"/>
    <xsl:apply-templates select="$list[position()=$i]" mode="contribution"/>
    <xsl:if test="$i &lt; $n">
	   <xsl:text>, </xsl:text>
	   <xsl:call-template name="comma_separated_list">
		<xsl:with-param name="list" select="$list"/>
		<xsl:with-param name="i" select="$i + 1"/>
		<xsl:with-param name="n" select="$n"/>
	   </xsl:call-template>
     </xsl:if>
  </xsl:template>
  <xsl:template name="indent">
    <xsl:param name="level"/>
    <xsl:if test="$level &gt; 0">
       <xsl:text>  </xsl:text>
       <xsl:call-template name="indent">
	<xsl:with-param name="level" select="$level - 1"/>
       </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="string-replace">
        <xsl:param name="string"/>
        <xsl:param name="from"/>
        <xsl:param name="to"/>
        <xsl:choose>
            <xsl:when test="contains($string, $from)">
                <xsl:variable name="before" select="substring-before($string, $from)"/>
                <xsl:variable name="after" select="substring-after($string, $from)"/>
                <xsl:variable name="prefix" select="concat($before, $to)"/>

                <xsl:value-of select="$before"/>
                <xsl:value-of select="$to"/>
                <xsl:call-template name="string-replace">
                    <xsl:with-param name="string" select="$after"/>
                    <xsl:with-param name="from" select="$from"/>
                    <xsl:with-param name="to" select="$to"/>
                </xsl:call-template>
            </xsl:when> 
            <xsl:otherwise>
                <xsl:value-of select="$string"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
 
</xsl:stylesheet>
