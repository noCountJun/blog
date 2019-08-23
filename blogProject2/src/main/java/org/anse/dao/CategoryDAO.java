package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CategoryDAO {

	/**
	 * ī�װ� �߰�
	 * @param categoryVo
	 * @throws Exception
	 */
	public void insertCategory(CategoryVO categoryVo) throws Exception;
	
	/**
	 * ī�װ� ����Ʈ ��ȸ
	 * @return
	 */
	public List<Map<String, Object>> getCategoryList();

	/**
	 * ī�װ� ��
	 * @param parmas
	 * @return
	 */
	public Map<String, Object> getCategoryInfo(Map<String, Object> parmas);
}
