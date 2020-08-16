<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String openId = request.getParameter("openId");
		//System.out.println(openId);
	%>
	<script language="javascript">
		//alert("lllue")
		var flag = 1;
		function myajax() {
			var myhttp;
			//alert("hello");
						myhttp = new XMLHttpRequest();
			myhttp.open("GET", "http://localhost:8080/TrashDistribute/server",
					true);
			myhttp.send();
			myhttp.onreadystatechange = function() {
				//alert(myhttp.readyState + "*" + myhttp.status);

				if (myhttp.readyState == 4 && myhttp.status == 200) {
					var msg = myhttp.responseText;
					alert(msg); 
					if (msg == "succeed") {
						window.clearInterval(c);
						//跳转成gong
						window.location.href = "http://www.baidu.com";
					} else {
						flag++;
						alert("fff" + flag);
						if (flag >= 3) {
							window.clearInterval(c);
							window.location.href = "http://www.cgsgo.com";//"http://localhost:8080/TrashDistribute/OpenIdQrcode.jsp";
						}
					}
				//alert("s");
				}
			}
			//}

		}
		//	myajax();
		//长轮询，１秒发送一次ajax请求
		c = window.setInterval(myajax, 1000);
	</script>
	跳转
</body>
</html>