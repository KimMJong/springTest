<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/detail.css">
<script type="text/javascript">
	function deleteShoes(no) {
		if (confirm("삭제하시겠습니가?")) {
			location.href = "shoes.delete?s_no=" + no;
		}
	}
</script>
</head>
<body>
	<div class="whole-box">
			<div style="margin-left: auto; margin-right: auto;">
				<img id="img" alt="" src="resources/imgs/${shoes.s_file }">
			</div>
			<table style="width: 600px; height: 400px; margin-left: auto; margin-right: auto;">
				<tr>
					<td class="td1">신발이름</td>
					<td class="td2">${shoes.s_name }</td>
				</tr>
				<tr>
					<td class="td1">신발 사이즈</td>
					<td class="td2">${shoes.s_size }</td>
				</tr>
				<tr>
					<td class="td1">신발 가격</td>
					<td class="td2">${shoes.s_price }</td>
				</tr>
				<tr>
					<td class="td1">브랜드</td>
					<td class="td2">${shoes.s_brand }</td>
				</tr>
				<tr>
					<td class="td1">설명</td>
					<td class="td2">${shoes.s_description }</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;">
						<button onclick="location.href='update.shoes.go?s_no=${shoes.s_no}'">수정하기</button>
						<button onclick="deleteShoes('${shoes.s_no}')">삭제</button>
					</td>
				</tr>
			</table>
	</div>
</body>
</html>