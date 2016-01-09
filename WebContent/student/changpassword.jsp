<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改密码</title>
   <style type="text/css">
<!--
.STYLE1 {
	font-size: medium;
	color: #0033FF;
}
body {
	background-color: #CCFF66;
	background-image: url(image/wrapBg_1.jpg);
}
-->
</style>
</head>
<body class="emx_nav_left">
<s:form  name="form1" method="post" action="updateStudent">
  <table width="676" height="368" align="center">
    <tr>
      <td colspan="3"><div align="center" class="STYLE1">修改个人密码</div>
        <div align="left"></div></td>
    </tr>
    <tr>
        <td width="190"><div align="right">用户名<s:hidden name="id" value="%{n.id}"/></div></td>
        <td width="295"><div align="left"><s:hidden name="department" value="%{n.department}"/><s:property value="%{n.username}"/></div></td>
      <td width="169">&nbsp;</td>
    </tr>
    <tr>
        <td><div align="right">学号<s:hidden name="sno" value="%{n.sno}"/></div></td>
      <td><div align="left"><s:property value="%{n.sno}"/></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">旧密码</div></td>
      <td><div align="left"><s:password name="password" /></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">新密码</div></td>
      <td><div align="left"><s:textfield name="password1"/></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right">确认新密码</div></td>
      <td><div align="left"><s:password  name="password2"/></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="right"></div></td>
      <td><div align="center">
        <label>
        <input type="submit" name="Submit" value="提交" />
        </label>
        <label>
        <input type="reset" name="Submit2" value="重置" />
        </label>
      </div></td>
      <td>&nbsp;</td>
    </tr>
  </table>
</s:form>
</body>
</html>
