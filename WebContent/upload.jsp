<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>图片上传</title>
        <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center>
        <h1><s:form action="myUpload" enctype="multipart/form-data">
                <s:file name="doc" label="选择上传的照片"/>
                <s:submit value="上传"/>
            </s:form>
            
            </h1>
    </center></body>
</html>
