<%-- 
    Document   : getClasses
    Created on : 2011-12-6, 20:16:04
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
      <s:form id="form1" name="form1" method="post" action="updataClasses">
  <table width="629" height="280" border="1" align="center">
    <tr>
      <td colspan="3"><div align="center">课程基本信息修改</div></td>
    </tr>
    <tr>
      <td width="128"><div align="right">课程名：</div></td>
      <td width="233"><s:textfield  name="cname" value="%{cs.cname}"/>&nbsp;</td>
      <td width="246">&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">学分：</div></td>
      <td><s:textfield name="cmark" value="%{cs.cmark}"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><p align="right">上课时间：</p>      </td>
      <td><s:textfield name="courTime" value="%{cs.coureTime}"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
   
     <tr>
      <td><div align="right">教师号：</div></td>
      <td><s:textfield name="teaId" value="%{cs.teaId}"/>"&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">最多选课人数：</div></td>
      <td><s:textfield name="chooseMax" value="%{cs.chooseMax}"/>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><label>
        
        <div align="left"></div>
      </label>
        <label>
        
        <div align="left"></div>
      </label></td>
      <td><input type="submit" name="Submit" value="提交" />
        <input type="reset" name="Submit2" value="重置" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</s:form>
    </body>
</html>
