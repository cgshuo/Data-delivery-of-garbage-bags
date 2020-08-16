<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.cgs.weixin.qrcode.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="book" class="com.cgs.Book"></jsp:useBean>
	<jsp:setProperty property="*" name="book" />
	<%
		request.setCharacterEncoding("UTF-8"); 
		String a = book.getPhoneId();
		String b = book.getBookName();
		String c = book.getBookAuthor();
		String d = a + " " + b +" " + c;
		System.out.println(d);
		QRcode.qrcode(d);
		out.println(d);

		/* try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/books";
		String user = "root";
		String password = "123";
		Connection conn = DriverManager.getConnection(url, user, password);//getConnection(url, user, password);
		String sql = "update tb_books(phoneId, bookName, bookAuthor)values(?,?,?)";
		//String sql = "update tb_books set bookName=?,bookAuthor=? where phoneId=?";
		
		//PreparedStatement ps = conn.prepareStatement(sql);//(sql);//(sql);
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, book.getPhoneId());
		ps.setString(2, book.getBookName());
		ps.setString(3, book.getBookAuthor());
		
		int row = ps.executeUpdate();
		if(row > 0){
			out.print("成功添加了"+row+"条数据");
		}
		ps.close();
		conn.close();
		}catch(Exception e){
			out.print("图书添加失败");
			e.printStackTrace();
		}
 */
 %>
 <a href="book_list.jsp">图书</a>
 
</body>
</html>