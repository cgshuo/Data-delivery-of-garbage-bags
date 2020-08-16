<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
获取数据
<%String bookInfo = "a=b=c"; %>
<script type="text/javascript">
	function Submit() {//扫码提交数据
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/server",
			data : bookInfo,
			error : function(request) {
				alert("发送请求失败！");
			},
			success:function(request){
				//长轮询，0.1秒发送一次ajax请求
			  	window.setInterval(myajax, 100);
			},
		});

	}
	   function myajax() {
	  		var myhttp;
	  		//alert("hello");
	  		myhttp = new XMLHttpRequest();
	  		myhttp.open(
	  						"GET",
	  						"http://localhost:8080/DonateBooks/servlet/Server.servertest",//请求路径
	  						true);//异步通信or同步通信
	  		myhttp.send();
	  		myhttp.onreadystatechange = function() {
	  			//alert(myhttp.readyState + "*" + myhttp.status);
	  			if (myhttp.readyState == 4 && myhttp.status == 200) {
	  				var BookId = myhttp.responseText;//验证值
	  				//alert(msg);
	  				if (BookId !=null) {
	  					//打印bookid
	  					alert(BookId);
	  					window.location.href="http://localhost:8080/DonateBooks/Client/NewFile.jsp";//跳转路径
	  				}
	  			}
	  		}
	   }
</script>

</body>

</html>