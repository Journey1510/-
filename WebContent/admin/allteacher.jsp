<%-- 
    Document   : allteacher
    Created on : 2011-12-6, 13:06:48
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
    <center><table border="1">
      <tr>
      <td>序号</td>
      <td>教师名</td>
      <td>教师号</td>
      <td>教师年龄</td>
      <td>教师电话</td>
      <td>教师邮箱</td>
      <td>修改教师信息</td>
      <td>删除</td>
    </tr>
     <s:iterator value="allTeacher" status="at">
          <tr>
                  <td>
                      <s:property value="#at.getIndex()+1+(pageNumber-1)*10"/>
                  </td>
                  <td>
                      <s:url  id="gets" action="getTeacher">
                          <s:param name="tid">
                      <s:property value="tid"/>
                      </s:param>
                      </s:url>
                      <s:a href="%{gets}"><s:property value="tname"/></s:a></td>
                  <td><s:property value="teaId"/></td>
                  <td><s:property value="age"/></td>
                  <td><s:property  value="tel"/></td>
                  <td><s:property  value="email"/></td>
                  <td><s:a href="%{gets}">修改教师信息</s:a></td>
                  
                  <td> 
                       <s:url  id="deleT" action="deleTeacher">
                          <s:param name="tid">
                      <s:property value="tid"/>
                      </s:param>
                      </s:url><s:a href="%{deleT}">删除</s:a></td>
           </s:iterator></table>
              <ul id="ulLink">
            <s:property value="pageNumber"/>|<s:property value="totalPage"/>
            <s:url id="firstPage" action="tpageAction">
                <s:param name="pageNumber">1</s:param>
            </s:url>
            <s:a cssClass="myst" href='tpageAction'>首页</s:a>
            <s:url id="prePage" action="tpageAction">
                <s:param name="pageNumber"><s:property value='pageNumber-1'/></s:param>
            
            </s:url>
            <s:a cssClass="myst" href="%{prePage}">上一页</s:a>
            <s:url id="nextPage" action="tpageAction">
                <s:param name="pageNumber"><s:property value='pageNumber+1'/>
                </s:param>
            </s:url>
            <s:a cssClass="myst" href="%{nextPage}">下一页</s:a>
            <s:url id="lastPage" action="tpageAction"><s:param name="pageNumber"><s:property value="totalPage"/>
                </s:param></s:url>
            <s:a cssClass="myst" href="%{lastPage}">末页</s:a>
            </ul>
        </center> </body>
    </body>
</html>
