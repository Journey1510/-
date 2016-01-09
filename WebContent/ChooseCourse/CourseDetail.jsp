<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>课程详情</title>
        <style type="text/css">
            li { margin-bottom: 20px; }
        </style>
    </head>
    <body>
        <s:debug/>
        <h1>欢迎查看您所选课程详细信息</h1>

        <ul>
            <li><h2>课程名：<s:property value="clas.cname"/></h2> </li>
            <li>  <h2>人数上限： <s:property value="clas.chooseMax"/></h2> </li>
            <li><h2>  已选人数： <s:property value="clas.chooseCurNum"/></h2> </li>
            <li> <h2>上课教室： <s:property value="clas.roomId"/></h2> </li>
            <li><h2> 课时：  <s:property value="clas.courTime"/></h2> </li>
            <li> <h2>学分：  <s:property value="clas.cmark"/></h2> </li>
            <br/>
            <h2>已选课人：</h2> <br/>
            <s:iterator value="clas.students" id="row">
                <li >
                    <h2 style="color:red;"><s:property value="#row.username"/></h2> <br/>
                </li>
            </s:iterator>
                <h2><a href="choose!confirmChooseClasses.action?cid=<s:property value="clas.csId"/>" style="font-size: 30px;">确认</a></h1>
    </ul>
        </body>
</html>
