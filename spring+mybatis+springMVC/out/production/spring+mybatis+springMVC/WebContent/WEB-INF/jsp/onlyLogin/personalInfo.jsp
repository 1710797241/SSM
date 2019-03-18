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
<h1>查看个人信息</h1>
    <input type="text" hidden="hidden" name="id" /><br/>
   姓名<input type="text" name="name"><br>
        邮箱<input type="text" name="email"><br>
      电话 <input type="text" name="phone"><br>
</div>
</body>
</html>