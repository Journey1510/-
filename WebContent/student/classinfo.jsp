<%-- 
    Document   : classinfo
    Created on : 2011-11-20, 23:15:52
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
      <form id="form1" name="form1" method="post" action="upstudent">
  <table  border="1" align="center">
    <tr>
        <td  align="right">姓名</td>
        <td><s:property value="%{n.username}"/></td>
      <td  align="right">学号</td>
      <td  align="left"><s:property value="%{n.sno}"/></td>
      <td >&nbsp;</td>
    </tr>
    <tr>
      <td align="right">电子邮箱</td>
      <td align="left"><s:textfield  value="%{n.email}"/></td>
      <td align="right">课程号</td>
      <td colspan="2" align="left"><s:textfield value="%{classes.id}"/></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td align="right"> 教师编号</td>
      <td align="left"><s:property value="%{classes.teaId}"/></td>
      <td align="right">课程名</td>
      <td colspan="2" align="left"><s:property value="%{classes.cname}"/></td>
    </tr>
    <tr>
      <td align="right">上课时间</td>
      <td align="left"><s:property value="%{classes.coreTime}"/></td>
      <td align="right">教室</td>
      <td align="left"><s:textfield value="%{classes.roomId}"/></td>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <s:hidden name="id" value="%{n.csId}"/>
        <td align="right"></td>
      <td align="left"></td>
      <td align="right"></td>
      <td colspan="2" rowspan="2"><div align="left"></div>        <div align="left"></div></td>
    </tr>
    <tr>
      <td><div align="right"></div></td>
      <td>        <label>
        <div align="right">
          <input type="submit" name="Submit" value="提交" />
        </div>
      </label></td>
      <td>        <label>
        
        <div align="left">
          <input type="reset" name="Submit2" value="重置" />
        </div>
      </label></td>
    </tr>
  </table>
  <div align="center"></div>
</form>
    </body>
</html>
