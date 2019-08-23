package org.anse.service;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CategoryService {

	/**
	 * ī�װ� ���
	 * @param categoryVo
	 * @throws Exception
	 */
	public void insertCategory(CategoryVO categoryVo) throws Exception;
	
	/**
	 * ī�װ� ����Ʈ
	 * @return
	 */
	public List<Map<String, Object>> getCategoryList();
	
	/**
	 * ī�װ� ������
	 * @param params
	 * @return
	 */
	public Map<String, Object> getCategoryInfo(Map<String, Object> params);
}
