<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">



<html>
  <body>
    <h2 align="center">Educational Qualification</h2>
    <table border="3" align="center" cellpadding="5" style="border-collapse: collapse; text-align:center;">

      <tr bgcolor="lightgray">
        <th>Qualification</th>
        <th>Institution</th>
        <th>Board/University</th>
        <th>Year of Passing</th>
        <th>Percentage/CGPA</th>
      </tr>

      <xsl:for-each select="/student/course">

        <tr>
          <td><xsl:value-of select="qualification"/></td>
          <td><xsl:value-of select="institution"/></td>
          <td><xsl:value-of select="board"/></td>
          <td><xsl:value-of select="year"/></td>
          <td><xsl:value-of select="cgpa"/></td>
        </tr>

      </xsl:for-each>

    </table>
  </body>
</html>



</xsl:template>
</xsl:stylesheet>
