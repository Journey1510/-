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
        <h1>ID:<s:property value="stu.stId" /></h1>
        <table border="1" align="center">
            <tr>
                
                <td>姓名:<s:property value="stu.username" /></td>
                <td>您已选的课程:</td>
                <td>所选学分</td>
                <td>操作&nbsp;</td>
           </tr>
           
               <s:iterator value="stu.classes" id="row">
                   <tr>
                     <td></td>
                   <td><s:property value="#row.cname" /></td>
                   <td><s:property value="#row.cmark"/></td>
                   <td>  <a href="choose!cancelClasses.action?cid=<s:property value="#row.csId"/>" >取消此课</a></td>
                   </tr>
               </s:iterator>
        
        </table>  
                <center>  </body>
</html>
