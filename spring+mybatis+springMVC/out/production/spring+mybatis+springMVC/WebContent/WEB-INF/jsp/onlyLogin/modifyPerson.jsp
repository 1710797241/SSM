<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #login{
            width: 500px;
            text-align: right;
        }
        input{
            margin-bottom: 10px;
        }
        input[type="submit"]{
            margin-right: 30px;
        }
    </style>
</head>
<body>
<div id="login">
<h1>修改个人信息</h1>
    <form action="${pageContext.request.contextPath }/onlyLogin/isModifyInfo.action"
    	method="post"
    >
    <input type="text" hidden="hidden" name="id" /><br/>
   
        邮箱<input type="text" name="email"><br>
      电话 <input type="text" name="phone"><br>
      <input type="submit" value="提交">
    </form>
</div>
</body>
</html>