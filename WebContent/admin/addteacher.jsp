<%-- 
    Document   : addteacher
    Created on : 2011-12-5, 15:24:21
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加教师</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
      <s:form id="form1" name="form1" method="post" action="addteacher">
  <table width="503" height="267" border="1" align="center">
    <tr>
      <td colspan="3"><div align="center">添加教师</div></td>
    </tr>
    <tr>
      <td width="233"><div align="right">教师姓名：</div></td>
      <td width="116"><s:textfield name="tname"/>&nbsp;</td>
      <td width="132">&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">教师年龄:</div></td>
      <td><s:textfield name="age"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">教师电话:</div></td>
      <td><s:textfield name="tel"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">教师邮箱:</div></td>
      <td><s:textfield name="email"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">教师编号:</div></td>
      <td><s:textfield name="teaId"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">教师密码:</div></td>
      <td><s:textfield name="tpassword"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><s:submit value="添加"/><s:reset value="重置 "/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</s:form>
    </body>
</html>
