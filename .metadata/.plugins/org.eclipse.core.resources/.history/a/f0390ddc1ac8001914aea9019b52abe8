<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!-- Content -->
<section>
	<header class="main">
		<h1>${categoryInfo.CTG_NM }</h1>
	</header>
	
	<c:if test="${not empty boardList}">
	
		<div class="table-wrapper">
			<table>
				<colgroup>
					<col width="10%" />
					<col width="70%" />
					<col width="10%" />
					<col width="10%" />
				</colgroup>
				<thead>
					<tr>
						<th>No</th>
						<th>제목</th>
						<th>등록일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="boardInfo" items="${boardList}" varStatus="i">
						
						<tr>
							<td>${boardInfo.RN}</td>
							<td><a href="/board/boardDetail/${boardInfo.BRD_ID}">(${boardInfo.CTG_NM}) &nbsp;&nbsp;&nbsp;${boardInfo.BRD_TITLE}</a></td>
							<td>${boardInfo.REG_DT}"</td>
							<td>${boardInfo.VIEW_CNT}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>
	<ul class="pagination">
		<li><span class="button">Prev</span></li>
		<li><a href="#" class="page active">1</a></li>
		<li><a href="#" class="page">2</a></li>
		<li><a href="#" class="page">3</a></li>
		<li><span>&hellip;</span></li>
		<li><a href="#" class="page">8</a></li>
		<li><a href="#" class="page">9</a></li>
		<li><a href="#" class="page">10</a></li>
		<li><a href="#" class="button">Next</a></li>
	</ul>
	<!-- <ul class="actions">
		<li><a href="#" class="button">등록</a></li>
	</ul> -->


</section>

