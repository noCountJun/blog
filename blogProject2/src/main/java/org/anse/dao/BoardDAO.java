package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface BoardDAO {
	
	/**
	 * �Խñ� ����Ʈ ��ȸ
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> getBoardList(Map<String, Object> params);
	
	
	/**
	 * �Խñ� �� ��ȸ
	 * @param params
	 * @return
	 */
	public Map<String, Object> getBoardInfo(Map<String, Object> params);
	
	
	/**
	 * ��ȸ�� ������Ʈ
	 * @param params
	 */
	public void updateViewCnt(Map<String, Object> params);
}