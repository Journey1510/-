<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>menu</title>
<link rel="stylesheet" href="skin/css/base.css" type="text/css" />
<link rel="stylesheet" href="skin/css/menu.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<script language='javascript'>var curopenItem = '1';</script>
<script language="javascript" type="text/javascript" src="skin/js/frame/menu.js"></script>
<base target="main" />
</head>
<body target="main">
<table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
  <tr>
    <td style='padding-left:3px;padding-top:8px' valign="top">
	<!-- Item 1 Strat -->
      <dl class='bitem'>
        <dt onClick='showHide("items1_1")'><b>信息管理</b></dt>
        <dd style='display:block' class='sitem' id='items1_1'>
          <ul class='sitemu'>
          <li>
              <div class='items'>
                <div class='fllct'><a href='skanTeacher' target='main'>教师信息</a></div>
              </div>
            </li>
            <li>
              <div class='items'>
                <div class='fllct'><a href='pageAction' target='main'>查看所有学生</a></div>
              </div>
            </li>
             <li>
            <div class='fllct'><a href='showTeacher' target='main'>修改个人信息</a></div>
               </div>
              </div>
            </li>
          </ul>
        </dd>
      </dl>    
          <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>课件管理</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>            
            <li><div class='fllct'><a href='uploadOutline.jsp' target='main'>上传考试大纲</a></div> </li>
            <li>
            <div class='fllct'><a href='uploadExplain.jsp' target='main'>上传作业讲解</a></div></li>
            <li>
            <div class='fllct'><a href='uploadPPT.jsp' target='main'>上传PPT</a></div></li>
            <li>
            <div class='fllct'><a href='uploadTestpaper.jsp' target='main'>上传历届考试题</a></div></li>
          </ul>
        </dd>
      </dl>   
      <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>课程管理</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>            
            <li><a href='cpageAction' target='main'>查看所有课程</a></li>
            <li><a href='addclasses.jsp' target='main'>添加课程</a></li>
          </ul>
        </dd>
      </dl>        
	  </td>
  </tr>
</table>
</body>
</html>
