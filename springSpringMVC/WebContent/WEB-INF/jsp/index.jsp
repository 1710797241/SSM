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
				color: white;
			}
			a{
				text-decoration:none;
			}
			a:hover{
				color: #c60;
			}
			.nav{
				width:100%
				height:40px;
				background-color:#550283;
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
		    .imgBg{
		    	width: 100%;
		    	height:690px;
		    	background: url(img/02.JPG) no-repeat 0 0;
		    	position: absolute;
		    	bottom:0px;
		    	
		    }
		</style>
	</head>
	<body>
		<div class="nav">
			<div class="nav-context">
					<ul class="left">
						<li>喵，欢迎来天猫</li>
						<li><a href="${pageContext.request.contextPath}/toLogin.action">请登录</a></li>
						<li><a href="${pageContext.request.contextPath}/toRegister.action">免费注册</a></li>
					</ul>
			       <ul class="right">
						<li><a href="${pageContext.request.contextPath}/goods/showGoods.action">商品详情</a></li>
					</ul>
			</div>
		</div>
		<img src="${pageContext.request.contextPath}/resources/img/02.JPG" width="1520px"/>
	</body>
</html>
