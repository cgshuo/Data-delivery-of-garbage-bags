<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script src="../js/jquery-3.1.0.min.js" type="text/javascript"></script>  
    </head>  
 
<body>
<body>  
     BOOKID
     <script type="text/javascript">
	function Submit() {//扫码提交数据
		$.ajax({
			 type : "POST",
			url : "${pageContext.request.contextPath}/server",
			data : bookInfo, 
			alert("A");
		});
C
	window.setInterval(Submit, 100);
</script>
</body>  
</body>
</html>