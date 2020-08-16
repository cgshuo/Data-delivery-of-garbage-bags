<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	扫码成功
	<br /> 您的剩余额度为:
	<%=request.getParameter("balance")%>
	<br />
	<br /> 确认领取?
	<br />
	<input type="button" onclick=javascrtpt:queren() value="确认" />

	<input type="button" onclick=javascrtpt:quxiao() value="取消" />
	<script type="text/javascript">
		function queren() {
			//window.location.href = "queren.jsp";
			alert("领取成功")
		}
		function quxiao() {
			//window.location.href = "quxiao.jsp";
			alert("已取消")
		}
	</script>

</body>
</html>