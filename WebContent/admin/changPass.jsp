<%-- 
    Document   : changPass
    Created on : 2012-3-6, 23:51:18
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改密码</title>
    <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center>
        <s:form action="changAd" method="post">
        <table>
            <tr>
                <td>
                    用户名:
                </td>
                <td>
                    <s:property value="#session.username"/>
                </td>
                
            </tr>
            <tr>
                <td>
                    新密码:
                </td>
                <td>
            <input type="text" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交">
                </td>
                <td>
                    <input type="reset" value="重置" >
                </td>
            </tr>
        </table>
        </s:form>
    </center></body>
</html>
