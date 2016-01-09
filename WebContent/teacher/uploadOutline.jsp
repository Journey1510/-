<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>上传考试大纲</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body><center>
    <h1>上传考试大纲</h1>
<s:form action="import1"
	enctype="multipart/form-data">
	<s:textfield name="title" label="文件标题"/><br />
	<s:file name="upload" label="选择文件"/><br />
	<s:submit value="上传"/>
</s:form>
</center>
</body>
</html>
