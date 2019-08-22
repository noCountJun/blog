package org.anse.service;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CategoryService {

	/**
	 * 카테고리 등록
	 * @param categoryVo
	 * @throws Exception
	 */
	public void insertCategory(CategoryVO categoryVo) throws Exception;
	
	
	public List<Map<String, Object>> getCategoryList();
	
	public Map<String, Object> getCategoryInfo(Map<String, Object> params);
}
