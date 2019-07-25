<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	** 미니 게시판 (MyBatis) **
	<br />
	<a href="insert">글 쓰기</a>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>글 제목</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<c:forEach var="b" items="${list}"> <!-- items="${list}" : list라는 키가 넘어온다. -->
			<tr>
				<td>${b.num}</td>
				<td><a href="detail?num=${b.num}">${b.title}</a></td>
				<td>${b.author}</td>
				<td>${b.readcnt}</td>
			</tr>
		</c:forEach>
		<!-- 검색 -->
		<tr>
			<td colspan="4">
				<form action="search" method="post">
					<select name="searchName">
						<option value="author">작성자</option>
						<option value="title">제목</option>
					</select> <input type="text" name="searchValue"> <input
						type="submit" value="검색">
				</form>
			</td>
		</tr>
	</table>
</body>
</html>