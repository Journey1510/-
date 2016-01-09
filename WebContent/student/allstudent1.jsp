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
            <td>用户名</td>
            <td>学号</td>
            <td>电子邮件</td>
            <td>电话</td>
            <td>学分</td>
            <td>性别</td>
            <td>院系</td>
            <td>籍贯</td>
            <td>照片</td>
            <td>查看用户</td>
            <td>删除</td>
        </tr>
            <s:iterator value="allStudent" status="st">
          <tr>
                  <td>
                      <s:property value="#st.getIndex()+1+(pageNumber-1)*10"/>
                  </td>
                  <td ><s:url  id="gets" action="getStudent">
                          <s:param name="stId">
                      <s:property value="stId"/>
                      </s:param>
                      </s:url>
                          <s:a href="%{gets}"><s:property value="username"/></s:a>
                  </td>
                  <td>
                      <s:property value="sno"/>
                  </td>
                  <td>
                      <s:property value="email"/>
                  </td>
                  <td>
                      <s:property value="tel"/>
                  </td>
                  <td>
                      <s:property value="mark"/>
                  </td>
                  <td>
                      <s:property value="sex"/>
                  </td>
                  <td>
                      <s:property value="department"/>
                  </td>
                  <td>
                      <s:property value="jiguan"/>
                  </td>
                  <td width="50" height="50">
                      <img src="upload/<s:property value="image"/>" width="40" height="40"/>
                  </td>
                  <td>
                      <s:a href="%{gets}">查看用户</s:a>
                  </td>
                  <td>
                      <s:url id="delete" action="dStudent">
                          <s:param name="sno">
                              <s:property value="sno"/>
                          </s:param>
                      </s:url>
                      <s:a href="%{delete}">删除</s:a>
                  </td>
            </tr>
        </s:iterator></table>
            <ul id="ulLink">
            <s:property value="pageNumber"/>|<s:property value="totalPage"/>
            <s:url id="firstPage" action="pageAction">
                <s:param name="pageNumber">1</s:param>
            </s:url>
            <s:a cssClass="myst" href='pageAction'>首页</s:a>
            <s:url id="prePage" action="pageAction">
                <s:param name="pageNumber"><s:property value='pageNumber-1'/></s:param>
            
            </s:url>
            <s:a cssClass="myst" href="%{prePage}">上一页</s:a>
            <s:url id="nextPage" action="pageAction">
                <s:param name="pageNumber"><s:property value='pageNumber+1'/>
                </s:param>
            </s:url>
            <s:a cssClass="myst" href="%{nextPage}">下一页</s:a>
            <s:url id="lastPage" action="pageAction"><s:param name="pageNumber"><s:property value="totalPage"/>
                </s:param></s:url>
            <s:a cssClass="myst" href="%{lastPage}">末页</s:a>
            </ul>
        </center> </body>
</html>
