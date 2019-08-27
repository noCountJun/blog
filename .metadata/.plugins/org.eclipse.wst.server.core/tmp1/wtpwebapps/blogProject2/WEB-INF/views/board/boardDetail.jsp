<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

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

	<hr class="major">
	
		
	
	
	
	<h3>Comment</h3>

	<c:if test="${not empty commentList}">
		<ul class="alt" id="commentWrap">
		</ul>
	</c:if>
	

	<form name="commentForm" id="commentForm" action="">
		<div class="row gtr-uniform">
			<div class="col-12">
				<textarea name="cmtCont" id="cmtCont" placeholder="Enter your comment" rows="2" maxlength="100"></textarea>
			</div>
			<div class="col-12-xsmall">
				<input type="text" name="cmtLoginId" id="cmtLoginId" placeholder="id" maxlength="10"/>
			</div>
			<div class="col-12-xsmall">
				<ul class="actions">
					<input type="password" name="cmtPassword" id="cmtPassword" placeholder="password" maxlength="10"/>
					<li><input type="button" onclick="insertCommentAjax();" value="send comment" class="primary" /></li>
				</ul>
			</div>
		</div>
		
		<input type="hidden" id="brdId" name="brdId" value='${boardInfo.BRD_ID }'/>
	</form>




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


<script type="text/javascript">
	$(function(){
		selectCommentList();
	});
	
	function selectCommentList() {
		$.ajax({
			url:  	'/comment/selectCommentListAjax',
			type:	'GET',
			data: 	{
					brdId : '${boardInfo.BRD_ID }'
			},
			dataType: 'json',
			success: function(data){
				var htmlStr = '';
				
				for (var i = 0; i < data.commentList.length; i++){
					
					var commentInfo = data.commentList[i];
					
					htmlStr += 	'<li>';
					htmlStr += 	'	<dt>';
					htmlStr += 			commentInfo.CMT_LOGIN_ID;
					htmlStr += 	' (	' +		commentInfo.REG_DT + ' ) '; 
					
					if(commentInfo.DEL_YN == 'N') {
						htmlStr += 	'	<div class="row gtr-uniform" style="float: right;">';
						htmlStr += 	'		<div class="col-12-xsmall">';
						htmlStr += 	'			<ul class="actions">';
						htmlStr += 	'				<input type="password" name="cmtPassword" id="cmtPassword_'+commentInfo.CMT_ID+'" placeholder="password" maxlength="10"/>';
						htmlStr += 	'				<a href="javascript:deleteComment('+commentInfo.CMT_ID+');" class="button">delete</a>';
						htmlStr += 	'			</ul>';
						htmlStr += 	'		</div>';
						htmlStr += 	'	</div>';
					}
					htmlStr += 	'	</dt>';
					
					if(commentInfo.DEL_YN == 'Y') {
						htmlStr += '<p><em>삭제된 댓글 입니다.</em></p>';
					} else {
						htmlStr += '<dd>';
						htmlStr += '	<p>'+commentInfo.CMT_CONT+'</p>';
						htmlStr += '</dd>';
					}
					htmlStr +=	'</li>';
				}

				jQuery('#commentWrap').html(htmlStr);
				
			},
			error: function(xhr, status, err) {
				console.log(xhr + " : " + status + " : " + err);
            }
		});	
		
	}

	function deleteComment(pCmdId) {
		var $cmtPassword = jQuery('#cmtPassword_'+pCmdId);
		
		if( $cmtPassword.val() == '') {
			alert('패스워드를 입력하세요');
			$cmtPassword.focus();
			return;
		}
		
		$.ajax({
			url:  '/comment/updateDelCommentAjax',
			type:'POST',
			data: {	brdId			: '${boardInfo.BRD_ID }',
					cmdId 			: pCmdId , 
					cmtPassword		: $cmtPassword.val()
			},
			dataType: 'json',
			async: false,
			success: function(data){
				if(data.resultCd == 0) {
					alert('비밀번호가 맞지 않습니다. 다시 확인해주세요');
				} else {
					alert('정상적으로 삭제됐습니다.');
					
					selectCommentList();
					
					$cmtPassword.val('');
				}
			},
			error: function(xhr, status, err) {
				console.log(xhr + " : " + status + " : " + err);
            }
		});	
	}
	
	function insertCommentAjax(){
		var $cmtCont = jQuery('#cmtCont');
		var $cmtLoginId = jQuery('#cmtLoginId');
		var $cmtPassword = jQuery('#cmtPassword');
		
		if($cmtCont.val() == '') {
			alert('댓글 내용을 입력하세요.');
			$cmtCont.focus();
			return;
		}
		if($cmtLoginId.val() == '') {
			alert('로그인 아이디를 등록하세요.');
			$cmtLoginId.focus();
			return;
		}
		if($cmtPassword.val() == '') {
			alert('비밀번호를 입력하세요.');
			$cmtPassword.focus();
			return;
		}
		
		
 		$.ajax({
			url:  '/comment/insertCommentAjax',
			type:'POST',
			data: $('#commentForm').serialize(),
			dataType: 'json',
			async: false,
			success: function(data){
				
				selectCommentList();
				
				$cmtCont.val('');
				$cmtLoginId.val('');
				$cmtPassword.val('');
				
			},
			error: function(xhr, status, err) {
				console.log(xhr + " : " + status + " : " + err);
            }
		});	
	}
</script>
