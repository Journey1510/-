<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
<form action="" method="post" name="form1" target="_parent" id="form1">
  <table width="1009" height="330" border="1" align="center">
    <tr>
      <td height="65" align="center" valign="middle">成绩基本信息</td>
    </tr>
    <tr>
        <td height="257"><ul id="ulhead">&nbsp;
                <li id="sequence">序列</li>
        <li id="username">姓名</li>
        <li id="sequence"></li>
            </ul>
            <s:iterator value="alluser" status="st">
        <li>
            <s:property value="#st.getIndex()+1+(pageNumber-1)*10"/>
        </li>
        <li><s:url id="gets" action="getUserName">
                <s:param name="sno">
                    <s:property value="userName"/>
                </s:param>
            </s:url>
            <s:a cssClass="maroon" href="%{gets}"><s:property value="userName"/></s:a>
        </li></td>
  </s:iterator>
    </tr>
  </table>
</form>
</body>   
</html>
