<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.cgs.weixin.qrcode.*"%>
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
		int t = 2;
		int f = 0;
		Class.forName("com.mysql.jdbc.Driver");
		// 数据库连接字符串
		String url = "jdbc:mysql://localhost:3306/message";
		// 数据库用户名
		String username = "root";
		// 数据库密码
		String password = "123";
		// 创建Connection连接
		Connection conn = DriverManager.getConnection(url, username, password);
		// 获取Statement
		Statement stmt = conn.createStatement();
		// 添加图书信息的SQL语句
		String sql = "select balance from _message where userId=" + t;
		//where userId=？";
		// 执行查询
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			f = rs.getInt("balance");
		}
		//System.out.println(f);
		rs.close(); // 关闭ResultSet
		stmt.close(); // 关闭Statement
		conn.close(); // 关闭Connection
	%>
	<jsp:forward page="//confirm.jsp">
		<jsp:param value="<%=f%>" name="balance" />
	</jsp:forward>
</body>
</html>