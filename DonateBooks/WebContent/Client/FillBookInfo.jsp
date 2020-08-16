<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">

<title>书籍信息</title>
<link rel="stylesheet" href="../css/phone.css">
<link rel="stylesheet" type="text/css" href="../css/weui.min.css">
<link rel="stylesheet" type="text/css" href="../css/jquery-weui.css">
<link rel="stylesheet" type="text/css" href="../css/demos.css">
<script src="../js/jquery-3.1.0.min.js" type="text/javascript"></script>

<!-- <script type="text/javascript">
	function loginSubmit(form) {
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/book",
			data : $("#loginForm").serialize(),
			error : function(request) {
				alert("发送请求失败！");
			},
			success:function(request){
				alert("成功");
				//window.location.href="http://localhost:8080/DonateBooks/book";
			},
		});

	}
</script> -->
</head>
<body>
	<form id="loginForm" name="loginForm"
		action="${pageContext.request.contextPath}/book" method="get">
		<h3 class="demos-title" style="margin-bottom: 50px; margin-top: 50px">请填写书籍信息</h3>
		<div class="weui_cell">
			<div class="weui_cell_hd">
				<label class="weui_label">书籍名称：</label>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<input class="weui_input" type="text" id="BookName" name="BookName"
					placeholder="请输入书籍名称">
			</div>
		</div>
		<div class="weui_cell">
			<div class="weui_cell_hd">
				<label class="weui_label">书籍作者：</label>
			</div>
			<div class="weui_cell_bd weui_cell_primary">
				<input class="weui_input" type="text" id="BookAuthor"
					name="BookAuthor" placeholder="请输入书籍作者">
			</div>
		</div>
		<div class="weui_cell_ft">
			<input style="width: 117px;" type="submit"
				class="weui_btn weui_btn weui_btn_mini weui_btn_primary" value="提交" />
				<!-- onclick="loginSubmit(this.form)" /> -->
		</div>
	</form>
</body>
</html>