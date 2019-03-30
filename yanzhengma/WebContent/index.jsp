<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<script type="text/javascript">
$(function(){
	$("#yanImg").click(function(){
		$.ajax({
			        type:"GET",
			        url:"${pageContext.request.contextPath}/yan",
			        success:function(data){
				$("#yanImg").attr("src","${pageContext.request.contextPath}/yan?ran="+Math.random())
			        },
			        error:function(jqXHR){
			           aler("发生错误："+ jqXHR.status);
			        }
			});
			
	})
})
</script>
<body>
<form action="">
	用户名：<input id="u" type="text" name="username" />
	密码：<input type="password" name="pass" />
	
	验证码：<span id="yanzhengma"><img id="yanImg" src="${pageContext.request.contextPath}/yan" /></span>
</form>
</body>
</html>