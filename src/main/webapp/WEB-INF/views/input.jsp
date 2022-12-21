<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/input.css">
</head>
<body>
	<div class="wrap-box">
		<div>
			<h2>신발 등록 페이지</h2>
		</div>
		<table class="regPage">
			<form action="shoes.reg.do" method="post"
				enctype="multipart/form-data">
				<tr>
					<td class="td1">사진</td>
					<td class="td2"><input name="s_file" type="file"></td>
				</tr>
				<tr>
					<td class="td1">이름</td>
					<td class="td2"><input name="s_name"></td>
				</tr>
				<tr>
					<td class="td1">사이즈</td>
					<td class="td2"><select name="s_size" id="shoes-size">
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
					<td class="td2"><input name="s_price" type="number"></td>
				</tr>
				<tr>
					<td class="td1">브랜드</td>
					<td class="td2"><input name="s_brand"></td>
				</tr>
				<tr id="description">
					<td class="td1">설명</td>
					<td class="td2"><textarea style="width: 300px; height: 200px;"
							name="s_description"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<button>글쓰기</button>
			</form>
			<button onclick="history.back()">취소</button>
			</td>

			</tr>


		</table>
	</div>
</body>
</html>