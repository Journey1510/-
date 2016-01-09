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
<s:form id="form1" name="form1" method="post" action="upstudent">
  <table  width="914" height="323"  border="0" align="center">
  <tr>
      <td colspan="3"><div align="center">个人基本信息</div></td>
     <td ><s:hidden name="stId" value="%{n.stId}"/>&nbsp;</td>
    <td >照片</td>
  </tr>
  <tr>
      <td>学号<s:hidden name="sno" value="%{n.sno}"/></td>
    <td><s:property  value="%{n.sno}"/>&nbsp;</td>
    <td>姓名</td>
    <td><s:property  value="%{n.username}"/>&nbsp;</td>
    <td rowspan="3"><img src="<%=request.getContextPath()%>/upload/<s:property value="%{n.image}"/>" width="40" height="40"/>&nbsp;</td>
  </tr>
  <tr>
    <td>籍贯</td>
    <td><s:textfield  name="jiguan" value="%{n.jiguan}"/>&nbsp;</td>
    <td>电话</td>
    <td><s:textfield  name="tel" value="%{n.tel}"/>&nbsp;</td>
  </tr>
  <tr>
    <td>电子邮件</td>
    <td><s:textfield name="email" value="%{n.email}"/>&nbsp;</td>
    <td>学分</td>
    <td><s:property value="%{n.mark}"/>&nbsp;</td>
  </tr>
  <tr>
    <td>院系</td>
    <td><s:property value="%{n.department}"/>&nbsp;</td>
    <td>性别</td>
    <td><s:property value="%{n.sex}"/>&nbsp;</td>
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
    <td><s:a href="../upload.jsp" target='main'>上传照片</s:a></td>
  </tr>
</table>
</s:form>
  
</body>
</html>