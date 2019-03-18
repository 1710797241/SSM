<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        ul{

            width: 200px;
            list-style:none;
            margin-left: 15px;
        }
        
        ul li{
			
            background-color: #2e6da4;
            margin-bottom: 5px;

        }
      a{
          display: inline-block;
          text-decoration: none;
          color:white;
      }
    </style>
</head>
<body>
<div>
    <ul>
        <li><a href="${pageContext.request.contextPath }/onlyLogin/showPersonInfo.action">查看个人信息</a></li>
        <li><a href="${pageContext.request.contextPath }/onlyLogin/modifyPersonInfo.action">修改个人信息</a></li>
        <li><a href="${pageContext.request.contextPath }/onlyLogin/modifyPass.action">修改密码</a></li>
   	
    </ul>
</div>
</body>
</html>