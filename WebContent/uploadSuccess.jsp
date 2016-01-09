<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>上传成功</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"> <table width="1141" height="349" border="0" align="center">
      <tr>
        <td width="321">&nbsp;</td>
        <td width="453"> <img  src="upload/<s:property value="docFileName"/>" width="400" height="400"/>&nbsp;</td>
        <td width="345">&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>  <s:property value="docFileName"/>&nbsp;</td>
        <td>上传成功！&nbsp;</td>
      </tr>
    </table>
                 
      
        </body>
</html>
