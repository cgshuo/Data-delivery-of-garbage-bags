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
  		String a = "t";
		request.setAttribute("openId", a);
		System.out.print(a);
		//连接数据库，根据openID查询余额
	%>
	<jsp:forward page="server"></jsp:forward>
	
</body>
</html>