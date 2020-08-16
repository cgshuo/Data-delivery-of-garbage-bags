<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二维码</title>
<%
	request.setCharacterEncoding("UTF-8");
	String a = request.getParameter("phoneId");
	String b = request.getParameter("bookName");
	String c = request.getParameter("bookAuthor");
	System.out.println(a + " " + b + " " + c);
%>

<script type="text/javascript" src="jquery-1.8.0.js"></script>
<script type="text/javascript" src="utf.js"></script>
<script type="text/javascript" src="jquery.qrcode.js"></script>
<script type="text/javascript">
		$(document).ready(function() {
		$("#qrcodeCanvas").qrcode({
			render : "canvas", /* ,			//设置渲染方式，有table和canvas，使用canvas方式渲染性能相对来说比较好 */
			text : "<%=a + " " + b + " " + c%>",
			width : "200", //二维码的宽度
			height : "200", //二维码的高度
			background : "#ffffff", //二维码的后景色
			foreground : "#000000", //二维码的前景色
		//src: 'qs.png'             //二维码中间的图片
		});
	});
</script>

</head>
<body>
	<center>
		<br />
		<div id="qrcodeCanvas"></div>
	</center>
</body>
</html>