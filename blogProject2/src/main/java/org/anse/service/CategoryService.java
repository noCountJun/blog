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
	
	/**
	 * 카테고리 리스트
	 * @return
	 */
	public List<Map<String, Object>> getCategoryList();
	
	/**
	 * 카테고리 상세정보
	 * @param params
	 * @return
	 */
	public Map<String, Object> getCategoryInfo(Map<String, Object> params);
}
