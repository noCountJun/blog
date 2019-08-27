package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CommentDAO {
	
	/**
	 * 댓글 리스트 조회
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> getCommentList(Map<String, Object> params);

	/**
	 * 댓글 등록
	 * @param params
	 */
	public void insertComment(Map<String, Object> params);
	
	
	/**
	 * 댓글, 비밀번호 매칭 카운트 조회
	 * @param params
	 * @return
	 */
	public int getMatchCommentCount(Map<String, Object> params);
	
	/**
	 * 댓글 del_yn = Y 로 업데이트 처리
	 * @param params
	 */
	public void updateDelComment(Map<String, Object> params);
	
}
