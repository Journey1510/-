<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改个人基本信息</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
<s:form id="form5" name="form5" method="post" action="upteacher">
  <table  width="914" height="323"  border="0" align="center">
  <tr>
      <td colspan="3"><div align="center">个人基本信息</div></td>
     <td ><s:hidden name="teaId" value="%{r.teaId}"/>&nbsp;</td>
    <td >&nbsp;</td>
  </tr>
  <tr>
      <td>教师号<s:hidden name="teaId" value="%{r.teaId}"/></td>
    <td><s:property  value="%{r.teaId}"/>&nbsp;</td>
    <td>姓名</td>
    <td><s:property  value="%{r.tname}"/>&nbsp;</td>
    <td rowspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td>籍贯</td>
    <td><s:textfield  name="jiguan" value="%{r.jiguan}"/>&nbsp;</td>
    <td>电话</td>
    <td><s:textfield  name="tel" value="%{r.tel}"/>&nbsp;</td>
  </tr>
  <tr>
    <td>电子邮件</td>
    <td><s:textfield name="email" value="%{r.email}"/>&nbsp;</td>
    <td>年龄</td>
    <td><s:property value="%{r.age}"/>&nbsp;</td>
  </tr>
  <tr>
    <td>院系</td>
    <td><s:property value="%{r.department}"/>&nbsp;</td>
    <td>性别</td>
    <td><s:property value="%{r.sex}"/>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>
        <input type="submit" name="Submit" value="提交" />
    </td>
    <td>
        <input type="reset" name="Submit2" value="重置" />
    </td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</s:form>
  
</body>
</html>