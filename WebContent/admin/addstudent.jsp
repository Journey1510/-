<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加用户</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
       <form id="form1" name="form1" method="post" action="adduser">
  <table width="613" height="379" border="1" align="center">
    <tr>
      <td width="128"><div align="right">用户名：</div></td>
      <td width="212"><s:textfield name="username"/>&nbsp;</td>
      <td width="201">&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">学号：</div></td>
      <td><s:textfield name="sno"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">电子邮件：</div></td>
      <td><s:textfield name="email"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">电话</div></td>
      <td><s:textfield name="tel"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">性别：</div></td>
      <td><s:textfield name="sex"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">院系:</div></td>
      <td><s:textfield name="department"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">籍贯：</div></td>
      <td><s:textfield name="jiguan"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">学分：</div></td>
      <td><s:textfield name="mark"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">密码:</td>
      <td><s:textfield name="password"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
     <tr>
      <td><div align="right">最大选课数:</td>
      <td><s:textfield name="naxClasses"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
        <input type="submit" name="Submit" value="提交" />
        <input type="reset" name="Submit2" value="重置" />
      </label></td>
      <td>&nbsp;</td>
    </tr>
  </table>
</form>
    </body>
</html>
