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
        <dt onClick='showHide("items1_1")'><b>常用操作</b></dt>
        <dd style='display:block' class='sitem' id='items1_1'>
          <ul class='sitemu'>
            <li>
              <div class='items'>
                <div class='fllct'><a href='skanStudent' target='main'>学生学籍</a></div>
              </div>
            </li>
            <li><div class='fllct'><a href='cscore' target='main'>成绩查询</a></div> </li>
            <li>
            <div class='fllct'><a href='showStudent' target='main'>修改个人信息</a></div>
               </div>
              </div>
            </li>
			<li><div class='fllct'><a href='chang' target='main'>密码修改</a></div></li>
          </ul>
        </dd>
      </dl>
    
      <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>选课系统</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>
            <li><a href='choose.action' target='main'>进入选课</a></li>
            <li><a href='choose!myClasses.action' target='main'>已选课程</a></li>
			<li><a href='cscore' target='main'>选课成绩</a></li>
          </ul>
        </dd>
      </dl>
       <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>学习系统</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>
            <li><a href='down.jsp' target='main'>下载考试大纲</a></li>
            <li><a href='down.jsp' target='main'>下载作业讲解</a></li>
			<li><a href='down.jsp' target='main'>下载PPT</a></li>
			<li><a href='down.jsp' target='main'>下载历届考试题</a></li>
          </ul>
        </dd>
      </dl>
      <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>其他</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>
            <li><a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=849713132&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:540770120:41 &r=0.7815125500474443" alt="请留言" title="请留言"></a></li>
            <li><a href='http://tieba.baidu.com/f?kw=%CE%E4%BA%BA%C0%ED%B9%A4%B4%F3%D1%A7' target='_blank'>校园论坛</a></li>	
          </ul>
        </dd>
      </dl>
      <!-- Item 2 End -->
	  </td>
  </tr>
</table>
</body>
</html>
