<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!-- Content -->
<section>
					
	<!-- Content -->
	<h2 id="content">${boardInfo.BRD_TITLE }</h2>
	<div class="row">
		<div class="col-6 col-12-small">
			<p>조회수  : ${boardInfo.VIEW_CNT }</p>
		</div>
		<div class="col-6 col-12-small">
			<p>등록일 : ${boardInfo.REG_DT }</p>
		</div>
	</div>
	
	<div class="box">
		${boardInfo.BRD_CONT }
	</div>
	
	<p/>

	<div class="row">
		<div class="col-6 col-12-small">
			<p>이전글 : 
				<c:choose>
			        <c:when test="${boardInfo.PRE_TITLE_ID eq '0'}">
			            ${boardInfo.PRE_TITLE }
			        </c:when>         
			        <c:otherwise>
			            <a href="/board/boardDetail/${boardInfo.PRE_TITLE_ID}">${boardInfo.PRE_TITLE }</a>
					</c:otherwise>
			    </c:choose>
			</p>
		</div>
		<div class="col-6 col-12-small">
			<p>다음글 : 
				<c:choose>
			        <c:when test="${boardInfo.NEXT_TITLE_ID eq '0'}">
			            ${boardInfo.NEXT_TITLE }
			        </c:when>         
			        <c:otherwise>
			            <a href="/board/boardDetail/${boardInfo.NEXT_TITLE_ID}">${boardInfo.NEXT_TITLE }</a>
					</c:otherwise>
			    </c:choose>
			</p>
		</div>
	</div>
</section>

