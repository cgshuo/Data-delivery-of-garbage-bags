<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="30" height="15" border="1" align="center">
<caption>扫码成功</caption>
</table>

<tr>
<td align="center" valign="middle">您的剩余额度为：</td>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver");
// 数据库连接字符串
String url = "jdbc:mysql://localhost:3306/message";
// 数据库用户名
String username = "root";
// 数据库密码
String password = "123";
// 创建Connection连接
Connection conn = DriverManager.getConnection(url,username,password);
// 获取Statement
Statement stmt = conn.createStatement();
// 添加图书信息的SQL语句
String sql = "select 余额 from _message where 用户id=？";
// 执行查询
ResultSet rs = stmt.executeQuery(sql);
%>


<% 
request.setAttribute("list", list);
rs.close();		// 关闭ResultSet
stmt.close();	// 关闭Statement
conn.close();	// 关闭Connection

%>
</body>
</html>