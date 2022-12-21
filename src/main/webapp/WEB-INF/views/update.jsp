<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/update.css">
</head>
<body>
	
	<div class="wrap-box">
	<div>
		<h2>신발 수정 페이지</h2>
	</div>
		<table class="regPage">
			<form action="shoes.update.do" method="post"
				enctype="multipart/form-data">
				<tr>
					<td colspan="2"><img style="margin-left: 90px; margin-bottom: 10px;" alt="" src="resources/imgs/${shoes.s_file }"> <input
					 style="margin-bottom: 10px;"	name="s_file2" type="file"></td>

				</tr>
				<tr>
					<td class="td1">이름</td>
					<td class="td2"><input placeholder="${shoes.s_name }" name="s_name2"></td>
				</tr>
				<tr>
					<td class="td1">사이즈</td>
					<td class="td2"><select name="s_size2" id="shoes-size">
							<option value="220">220</option>
							<option value="225">225</option>
							<option value="230">230</option>
							<option value="235">235</option>
							<option value="240">240</option>
							<option value="245">245</option>
							<option value="250">250</option>
							<option value="255">255</option>
							<option value="260">260</option>
							<option value="265">265</option>
							<option value="270">270</option>
							<option value="275">275</option>
							<option value="280">280</option>
					</select></td>
				</tr>
				<tr>
					<td class="td1">가격</td>
					<td class="td2"><input placeholder="${shoes.s_price }" name="s_price2"
						type="number"></td>
				</tr>
				<tr>
					<td class="td1">브랜드</td>
					<td class="td2"><input placeholder="${shoes.s_brand }" name="s_brand2"></td>
				</tr>
				<tr id="description">
					<td class="td1">설명</td>
					<td class="td2"><textarea style="width: 90%; height: 200px;"
							name="s_description2">${shoes.s_description }</textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;"><input name="s_no2"
						value="${shoes.s_no }" type="hidden">
						<button>수정하기</button>
			</form>
			</td>

			</tr>
		</table>
	</div>
</body>

</html>