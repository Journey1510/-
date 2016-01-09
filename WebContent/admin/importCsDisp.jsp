<%-- 
    Document   : importCsDisp
    Created on : 2012-3-7, 0:54:39
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>导入成功</title>
        <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center>
        <h1><s:property  value="excelWorkSheet.sheetName" />
            </h1>
        <p>
            <s:iterator value="excelWorkSheet.columns">
        <s:property/></s:iterator>
        </p>
        <table>
        <s:iterator var="cs"  value="excelWorkSheet.data" >
            <tr>
                <td> <s:property value="#cs.teaId"/></td>
                <td><s:property value="#cs.cname"/></td>
                <td><s:property value="#cs.cmark"/></td>
             <td><s:property value="#cs.courTime"/></td>
             <td><s:property value="#cs.roomId"/></td>
             <td><s:property value="#cs.chooseMax"/></td>
           
           </tr>
        </s:iterator>
        </table>
    </center></body>
</html>

