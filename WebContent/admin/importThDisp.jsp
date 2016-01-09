<%-- 
    Document   : dispdata
    Created on : 2012-3-1, 20:53:42
    Author     : mm
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
        <s:iterator var="teach"  value="excelWorkSheet.data" >
            <tr>
                <td> <s:property value="#teach.teaId"/></td>
                <td><s:property value="#teach.tname"/></td>
                <td><s:property value="#teach.age"/></td>
             
           
           </tr>
        </s:iterator>
        </table>
    </center></body>
</html>
