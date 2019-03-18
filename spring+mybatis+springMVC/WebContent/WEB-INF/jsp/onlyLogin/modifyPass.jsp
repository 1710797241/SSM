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
<h1>修改密码</h1>
<form action="${pageContext.request.contextPath }/onlyLogin/isModifyPass.action"
    	method="post"
    	
    >   
    	<input type="text" hidden="hidden" name="username"><br>
    旧密码<input type="password" name="passowrd" ><br>
        新密码<input type="password" name="newpassowrd" ><br>
        <input type="submit" value="提交"/><br>
    </form>
</div>
</body>
</html>