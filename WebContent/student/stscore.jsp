<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>选课结果</title>
         <style type="text/css">
        #ge{ height:20px; background-color:#AAEC79;}
        </style>
    </head>
    <body id="ge">
    <center>
        <h1>ID:<s:property value="#session.id" /></h1>
        <table border="1" align="center">
            <tr>
                
                <td>姓名:<s:property value="stu.username" /></td>
                <td>您的课程:</td>
                <td>您的分数</td>
           
           </tr>

               <s:iterator value="s" id="row">
                   <tr>
                     <td></td>
                   <td><s:property value="#row.courseName" /></td>
                   <td><s:property value="#row.score"/></td>
                   
                   </tr>
               </s:iterator>
        
        </table>  
                <center>  </body>
</html>
