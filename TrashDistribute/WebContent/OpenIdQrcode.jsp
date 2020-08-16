<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二维码</title>
<%
	request.setCharacterEncoding("UTF-8");
	String openId = request.getParameter("openId");
	//System.out.println(openId);
%>
<script type="text/javascript">
  function myajax() {
		var myhttp;
		//alert("hello");
		myhttp = new XMLHttpRequest();
		myhttp.open(
						"GET",
						"http://localhost:8080/TrashDistribute/server",//请求路径
						true);//异步通信or同步通信
		myhttp.send();
		myhttp.onreadystatechange = function() {
			//alert(myhttp.readyState + "*" + myhttp.status);
			if (myhttp.readyState == 4 && myhttp.status == 200) {
				var msg = myhttp.responseText;//验证值
				//alert("msg");
				alert(msg);
				if (msg == "succeed") {
					//跳转成gong
					window.location.href="http://localhost:8080/TrashDistribute/Succeed2.jsp";//跳转路径
				}
			}
		}
  }
	//长轮询，0.1秒发送一次ajax请求
	window.setInterval(myajax, 100);
</script>

<script type="text/javascript" src="jquery-1.8.0.js"></script>
<script type="text/javascript" src="utf.js"></script>
<script type="text/javascript" src="jquery.qrcode.js"></script>
<script type="text/javascript">
		//out.print("hhh");
		$(document).ready(function() {
		$("#qrcodeCanvas").qrcode({
			render : "canvas", /* ,			//设置渲染方式，有table和canvas，使用canvas方式渲染性能相对来说比较好 */
			text : "垃圾tomcat",
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