<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("UTF-8");%>
	<jsp:useBean id="person" class="com.cgs.Book" scope="page">
		<jsp:setProperty name="person" property="*"/>
	</jsp:useBean>
	<table align="center" width="300" height="200" border="1">
			<tr>
				<td align="center" colspan="2" height="40">
					<b>图书信息</b>
				</td>
			</tr>
		<tr>
			<td align="right">手机号：</td>
			<td>
				<jsp:getProperty property="phoneId" name="person"/>
			</td>
		</tr>
		<tr>
			<td align="right">书籍名称：</td>
			<td>
				<jsp:getProperty property="bookName" name="person"/>
			</td>
		</tr>
		<tr>
			<td align="right">作者：</td>
			<td>
				<jsp:getProperty property="bookAuthor" name="person"/>
			</td>
		</tr>
			</table>
</body>
</html>