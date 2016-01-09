<%-- 
    Document   : choiceclass
    Created on : 2011-11-11, 9:06:52
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center><table border="1">
      <tr>
      <td>序号</td>
      <td>课程名</td>
      <td>上课时间</td>
      <td>教室</td>
      <td>教师编号</td>
      <td>修改</td>
      <td>删除</td>
    </tr>
     <s:iterator value="allClasses" status="cs">
          <tr>
                  <td>
                      <s:property value="#cs.getIndex()+1+(pageNumber-1)*10"/>
                  </td>
                  <td>
                      <s:url  id="gets" action="getClasses">
                          <s:param name="csId">
                      <s:property value="cname"/>
                      </s:param>
                      </s:url>
                      <s:a href="%{gets}"><s:property value="cname"/></s:a></td>
                  <td><s:property value="courTime"/></td>
                  <td><s:property value="roomId"/></td>
                  <td><s:property  value="teaId"/></td>
                  <td><s:a href="%{gets}">查看</s:a></td>
                  <td> <s:url  id="gets1" action="getdelteCs">
                          <s:param name="csId">                
                      </s:param>
                      </s:url><s:a href="%{gets1}">删除</s:a></td>
           </s:iterator></table>
              <ul id="ulLink">
            <s:property value="pageNumber"/>|<s:property value="totalPage"/>
            <s:url id="firstPage" action="cpageAction">
                <s:param name="pageNumber">1</s:param>
            </s:url>
            <s:a cssClass="myst" href='cpageAction'>首页</s:a>
            <s:url id="prePage" action="cpageAction">
                <s:param name="pageNumber"><s:property value='pageNumber-1'/></s:param>
            
            </s:url>
            <s:a cssClass="myst" href="%{prePage}">上一页</s:a>
            <s:url id="nextPage" action="cpageAction">
                <s:param name="pageNumber"><s:property value='pageNumber+1'/>
                </s:param>
            </s:url>
            <s:a cssClass="myst" href="%{nextPage}">下一页</s:a>
            <s:url id="lastPage" action="cpageAction"><s:param name="pageNumber"><s:property value="totalPage"/>
                </s:param></s:url>
            <s:a cssClass="myst" href="%{lastPage}">末页</s:a>
            </ul>
        </center> </body>
</html>
