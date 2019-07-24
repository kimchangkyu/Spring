<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String ss = (String) request.getAttribute("say");
		out.print(ss + "만세");
	%>
	<br> ${requestScope.say}<!-- EL문자 : 프로그램기능 추가를 하려면 JSTL을 사용해야한다. -->
	<br> ${say}<!-- ${requestScope.say}과 같은 표현 ==> requestScope는 생략이 가능하기 때문이다. -->
</body>
</html>