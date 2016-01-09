<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
   <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center>
     <h3>学生信息导入</h3>
        <s:form action="importcs" method="post" enctype="multipart/form-data">导入excel文件
        <s:file name="excelFile"/>
            <s:submit value="导入"></s:submit>
        </s:form>
    </center> </body>
</html>
