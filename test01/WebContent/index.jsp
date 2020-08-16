<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>赠人玫瑰，手留余香</title>
</head>
<body>
	<form action="demo.jsp" method="post" >
			<table align="center" width="400" height="200" border="1">
			<tr>
				<td align="center" colspan="2" height="40">
					<b>添加书籍信息</b>
				</td>
			</tr>
			<tr>
				<td align="right">手机号：</td>
				<td>
					<input type="text" name="phoneId">
				</td>
			</tr>
			<tr>
				<td align="right">书籍名称：</td>
				<td>
					<input type="text" name="bookName">
				</td>
			</tr>
			<tr>
				<td align="right">作者：</td>
				<td>
					<input type="text" name="bookAuthor">
				</td>
			</tr>
				<tr>
				<td align="center" colspan="2">
					<input type="submit" value="添　加">
				</td>
			</tr>
		</table>
	</form>


</body>
</html>