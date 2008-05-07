<?xml version='1.0'?>
<!-- $Id: xml.xsl,v 1.1 2005/08/15 15:18:07 yijunsf Exp $
     Example 3 in the XSLT tutorial of CSC408H -->
<xsl:stylesheet version='1.0'
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:req="http://www.cs.toronto.edu/~yijun/requirements"
                xmlns="http://www.cs.toronto.edu/~yijun/requirements"
                >
  <xsl:output method="text"/>
  <xsl:template match="/"> 
      <xsl:for-each select="req:model/req:goal | req:model/req:soft">
      	<xsl:apply-templates select="." mode="decomposition"/>
      </xsl:for-each>
  </xsl:template>
  <xsl:template match="req:goal | req:soft" mode="decomposition"> 
	<xsl:call-template name="indent">
	   <xsl:with-param name="level" select="count(ancestor::req:goal)" />
	</xsl:call-template>
        <xsl:text>"</xsl:text>
	<xsl:value-of select="@name"/>
        <xsl:text>"</xsl:text>
	<xsl:if test="count(req:goal | req:soft) &gt; 0">
		<xsl:text> {</xsl:text>
		  <xsl:for-each select="req:*">
		     <xsl:apply-templates select="." mode="decomposition"/>
		  </xsl:for-each>
		<xsl:call-template name="indent">
		   <xsl:with-param name="level" select="count(ancestor::req:goal| ancestor::req:soft)" />
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
</xsl:stylesheet>
