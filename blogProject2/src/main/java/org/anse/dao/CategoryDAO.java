package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface CategoryDAO {

	public String getTime();
	
	/**
	 * 카테고리 추가
	 * @param categoryVo
	 * @throws Exception
	 */
	public void insertCategory(CategoryVO categoryVo) throws Exception;
	
	public List<Map<String, Object>> getCategoryList();

	public Map<String, Object> getCategoryInfo(Map<String, Object> parmas);
}
