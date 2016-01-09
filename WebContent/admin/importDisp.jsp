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
        <s:iterator var="stu"  value="excelWorkSheet.data" >
            <tr>
                <td> <s:property value="#stu.sno"/></td>
                <td><s:property value="#stu.username"/></td>
                <td><s:property value="#stu.sex"/></td>
                <td><s:property value="#stu.department"/></td>
                <td><s:property value="#stu.jiguan"/></td>
               
                <s:property value="#stu.email"/>
                 <s:property value="#stu.tel"/>
           </tr>
        </s:iterator>
        </table>
    </center></body>
</html>
