<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
</head>
<body>
	<div class="whole-box">
		<div class="menu">
			<h2>신발 판매 사이트</h2>
		</div>

		<div class="items">
			<c:forEach items="${shoes }" var="s">
				<div class="items-in" onclick="location.href='detail.shoes.go?s_no='+${s.s_no}">
					<div style="width: 300px; height: 200px"> <img id="img" alt="" src="resources/imgs/${s.s_file }"> </div>
					<p>${s.s_name } </p>
					<p>${s.s_price } </p>
				</div>
			</c:forEach>
		</div>
		<div class="btn-bar">
			<button id="btn" style="width: 70px; height: 50px; border-radius: 5pt;" onclick="location.href='shoes.reg.go'">글쓰기</button>
		</div>
	</div>
</body>
</html>