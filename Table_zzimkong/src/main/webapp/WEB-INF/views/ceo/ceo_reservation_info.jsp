<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- 글로벌 css --%>
<link href="${pageContext.request.contextPath }/resources/css/global.css" rel="stylesheet">
<%-- 본문 css --%>
<link href="${pageContext.request.contextPath }/resources/css/ceo_article.css" rel="stylesheet">
<%-- 사이드바 css --%>
<!-- <link href="side_bar.css" rel="stylesheet"> -->
</head>
<body>
<input type="hidden" name="res_idx" value="${res.res_idx}" />
	<section class="ceo_popup_sec">
		<div class="text_inner">
			<div class="header_div01">
				<span><h3>예약 상세 정보</h3></span>
			</div>
		</div>
		<div class="text_inner">
<!-- 			<h3>예약자</h3> -->
			<table border="1">
				<tr>
					<th>예약번호</th>
					<th>방문자성명</th>
					<th>연락처</th>
					<th>예약인원</th>
					<th>예약메뉴</th>
					<th>예약금</th>
					<th>선주문 금액</th>
				</tr>
				<tr>
					<td>f1e9fvl</td>
					<td>홍길동</td>
					<td>010-4674-4772</td>
					<td>2명</td>
					<td>
					* 스테이크<br>
					* 파스타<br>
					* 샐러드
					</td>
					<td>40000원</td>
					<td>127,000원</td>
					
				</tr>
			</table>
			<br>
			<button type="button" class="button_olive" onclick="javascript:window.close()">닫기</button>
		</div>
	</section>	

</body>
</html>