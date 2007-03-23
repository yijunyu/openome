<?xml version="1.0"?>
<!-- convert generated XMI into WBI XML -->
<xsl:stylesheet version="1.0"
  xmlns:xmi="http://www.omg.org/XMI"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:wbim="http://www.ibm.com/wbim/bomSchema1.0"
  xmlns="http://www.ibm.com/wbim/bomSchema1.0">
  <xsl:output method="xml" indent="yes" />
  <xsl:strip-space elements="*"/>
  <xsl:template match="/">
    <xsl:element name="model">
      <xsl:attribute name="name">WBIM Test Model</xsl:attribute>
      <xsl:attribute name="schemaVersion">6.0</xsl:attribute>
	  <xsl:for-each select="wbim:ModelType">
		<xsl:apply-templates select="."/>
	  </xsl:for-each>
    </xsl:element>
  </xsl:template>
  <xsl:template match="wbim:ModelType">
	  <xsl:for-each select="*">
		<xsl:apply-templates select="."/>
	  </xsl:for-each>
  </xsl:template>
  <xsl:template match="*">
	<xsl:element name="{local-name()}">
  	   <xsl:for-each select="@*">
		<xsl:attribute name="{local-name()}">
			<xsl:value-of select="."/>
		</xsl:attribute>
  	   </xsl:for-each>
  	   <xsl:for-each select="*">
		<xsl:apply-templates select="."/>
  	   </xsl:for-each>
	</xsl:element>
  </xsl:template>
</xsl:stylesheet>
