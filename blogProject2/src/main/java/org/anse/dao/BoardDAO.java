package org.anse.dao;

import java.util.List;
import java.util.Map;

import org.anse.vo.CategoryVO;

public interface BoardDAO {
	public List<Map<String, Object>> getBoardList(Map<String, Object> params);
}
