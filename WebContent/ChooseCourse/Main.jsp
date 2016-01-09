<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>学生选课</title>
        <style type="text/css">
            table{ text-align: left; border: 1px solid silver;  }
           th , tr,  td{border: 1px solid silver;  }
            ul li { margin-bottom: 20px;}
        </style>
    </head>
    <body>
        <s:debug/>
        <h1 style="color:red;">你已选的课<s:property value="stu.classes.size" />  /  <s:property value="stu.maxClasses" />  </h1>
        <table border="1" align="center" >
            <tr>
                <td>课程名称</td>
                <td>已选/名额上限</td>
            </tr>
           
             <s:iterator value="classesList" id="row">
                <tr> 
                   <td><a href="choose!viewDetail.action?cid=<s:property value="#row.csId"/> "><s:property value="#row.cname" /></a>
                   </td><td>（<s:property value="#row.chooseCurNum"/> / <s:property value="#row.chooseMax" />）</td> 
                   </tr>
             </s:iterator>  
              

        </table>
          
    </body>
</html>
