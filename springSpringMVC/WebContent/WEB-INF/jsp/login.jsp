<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form name="frm"  action="${pageContext.request.contextPath}/login.action" 
 method="post" enctype="multipart/form-data">
	        用户名:<input type="text" name="username"><br>
	        密码:<input type="password" name="password"><br>
	       姓名：<input type="text" name="name"><br>
	      电话：<input type="text" name="phone"><br>
	      邮箱：<input type="text" name="email"><br>
       个人头像: <input type="file" name="file"><br>
               <input type="submit" value="登录">
  </form>
</body>
</html>