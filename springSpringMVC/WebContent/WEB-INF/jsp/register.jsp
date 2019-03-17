<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h1>天猫</h1>
		<form action="${pageContext.request.contextPath}/register.action" method="post" enctype="multipart/form-data">
			用户名:<input type="text" name="username"/><br />
			密码:<input type="password" name="password"/><br />
			  姓名：<input type="text" name="name"><br>
	      电话：<input type="text" name="phone"><br>
	      邮箱：<input type="text" name="email"><br>
       个人头像: <input type="file" name="file"><br>
			<input type="submit" value="注册" />
		</form>
	</body>
</html>
