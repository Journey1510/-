<%-- 
    Document   : allstudent1
    Created on : 2011-11-8, 22:04:53
    Author     : mm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <script language="JavaScript" type="text/javascript">
//--------------- LOCALIZEABLE GLOBALS ---------------
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
//Ensure correct for language. English is "January 1, 2004"
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
//---------------   END LOCALIZEABLE   ---------------
</script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>信息查看</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge"><center><table border="1">
            <tr>
            <td>序列</td>
            <td>课程名</td>
            <td>学分</td>
            <td>上课时间</td>
            <td>授课教室</td>
            <td>教师号</td>
            <td>课程号</td>
            <td>选课最大人数</td>
            <td>已选课的学生</td>
            <td>选课号</td>
            <td>删除</td>
        </tr>
            <s:iterator value="allClasses" status="st">
          <tr>
                  <td>
                      <s:property value="#st.getIndex()+1+(pageNumber-1)*10"/>
                  </td>
                  <td ><s:url  id="gets" action="skanCs">
                          <s:param name="csId">
                      <s:property value="csId"/>
                      </s:param>
                      </s:url>
                          <s:a href="%{gets}"><s:property value="cname"/></s:a>
                  </td>
                  <td>
                      <s:property value="cmark"/>
                  </td>
                  <td>
                      <s:property value="courTime"/>
                  </td>
                  <td>
                      <s:property value="roomId"/>
                  </td>
                  <td>
                      <s:property value="teaId"/>
                  </td>
                  <td>
                      <s:property value="csId"/>
                  </td>
                  <td>
                      <s:property value="choosemax"/>
                  </td>
                  <td>
                      <s:property value="choosecurnum"/>
                  </td>
                  <td>
                      <s:url id="delete" action="deleCs">
                          <s:param name="csId">
                              <s:property value="csId"/>
                          </s:param>
                      </s:url>
                      <s:a href="%{delete}">删除</s:a>
                  </td>
            </tr>
        </s:iterator></table>
            <ul id="ulLink">
            <s:property value="pageNumber"/>|<s:property value="totalPage"/>
            <s:url id="firstPage" action="cpageAction">
                <s:param name="pageNumber">1</s:param>
            </s:url>
            <s:a cssClass="myst" href='pageAction'>首页</s:a>
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
