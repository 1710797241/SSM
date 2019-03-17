<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<style>
			*{
				padding: 0px;
				margin: 0px;
			}
			a{
				text-decoration:none;
				color: #999;
			}
			a:hover{
				color: #999;
			}
			.nav{
				width:100%
				height:40px;
				background: #f2f2f2;
				font-size:12px;
			}
			.nav-context{
			   width: 1230px;
			   height: 32px;
			   margin: 0 auto;
			   position: relative;
			   line-height: 32px;
			}
			ul li{
				list-style: none;
				float: left;
				margin-left:10px;
			}
			.left{
				position: absolute;
				left: 5px;
			}
			.right{
				position: absolute;
				right: 200px;
			}
			#main{
				position:relative;
				left:0
				top:0
			}
		</style>
		<script type="text/javascript">
			window.onload=function(){
				var sw = screen.availWidth-17;
				var sh = screen.availHeight;
				document.getElementById("main").style.width=sw+"px";
				document.getElementById("main").style.height=sh+"px";
			}
		</script>
	</head>
	<body>
		<div class="nav">
			<div class="nav-context">
					<ul class="left">
						<li style="color: #999;">喵，欢迎来天猫</li>
						<li><a href="${pageContext.request.contextPath}/toLogin.action">请登录</a></li>
						<li><a href="${pageContext.request.contextPath}/toRegister.action">免费注册</a></li>
					</ul>
			       <ul class="right">
						<li><a href="${pageContext.request.contextPath}/goods/showGoods.action">我的淘宝</a></li>
						<li><a href="${pageContext.request.contextPath}/logout.action">退出</a></li>
					</ul>
			</div>
		</div>
		<div id="main">
			<img alt="" src="${pageContext.request.contextPath}/resources/img/index.png">
		</div>
	</body>
</html>
