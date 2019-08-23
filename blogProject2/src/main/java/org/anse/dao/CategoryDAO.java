package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CategoryDAO {

	/**
	 * 카테고리 추가
	 * @param categoryVo
	 * @throws Exception
	 */
	public void insertCategory(CategoryVO categoryVo) throws Exception;
	
	/**
	 * 카테고리 리스트 조회
	 * @return
	 */
	public List<Map<String, Object>> getCategoryList();

	/**
	 * 카테고리 상세
	 * @param parmas
	 * @return
	 */
	public Map<String, Object> getCategoryInfo(Map<String, Object> parmas);
}
