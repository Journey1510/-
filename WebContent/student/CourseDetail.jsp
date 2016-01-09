<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>课程详情</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
    <center>
        <h3>欢迎查看您所选课程详细信息</h3>
        <table  border="1" ><tr><td>课程名：</td>
                <td>人数上限：</td>
                <td>已选人数：</td>
                <td>上课教室：</td>
                <td>课时： </td>
                <td>学分：</td>
                <td>选择</td>
            </tr>
            <tr>
                <td><s:property value="clas.cname"/></td>
                <td><s:property value="clas.chooseMax"/></td>
                <td><s:property value="clas.chooseCurNum"/></td>
                <td><s:property value="clas.roomId"/></td>
                <td><s:property value="clas.courTime"/></td>
                <td><s:property value="clas.cmark"/></td>
                <td><a href="choose!confirmChooseClasses.action?cid=<s:property value="clas.csId"/>" style="font-size: 30px;">选修</a></td>
            </tr>
             <tr>
                <td colspan="7">《计算机网络》的特点是概念准确、论述严谨、内容新颖、图文并茂。突出基本原理和基本概念的阐述，同时力图反映出计算机网络的一些最新发展。《计算机网络》可供电气信息类和计算机类专业的大学本科生和研究生使用，对从事计算机网络工作的工程技术人员也有学习参考价值。</td>
               </tr>
           
            <tr><td>已选课人：</td><td colspan="6">  <s:iterator value="clas.students" id="row">
                <li >
                    <h3 style=";"><s:property value="#row.username"/></h3> <br/>
                </li>
            </s:iterator></td></tr>
          
         
        </table></center>  </body>
</html>
