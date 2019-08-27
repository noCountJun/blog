package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CommentDAO {
	
	/**
	 * ��� ����Ʈ ��ȸ
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> getCommentList(Map<String, Object> params);

	/**
	 * ��� ���
	 * @param params
	 */
	public void insertComment(Map<String, Object> params);
	
	
	/**
	 * ���, ��й�ȣ ��Ī ī��Ʈ ��ȸ
	 * @param params
	 * @return
	 */
	public int getMatchCommentCount(Map<String, Object> params);
	
	/**
	 * ��� del_yn = Y �� ������Ʈ ó��
	 * @param params
	 */
	public void updateDelComment(Map<String, Object> params);
	
}
