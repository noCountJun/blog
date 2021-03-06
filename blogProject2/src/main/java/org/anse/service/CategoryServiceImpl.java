package org.anse.service;

import java.util.List;
import java.util.Map;

import org.anse.dao.CategoryDAO;
import org.anse.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDao;
	
	@Override
	public void insertCategory(CategoryVO categoryVo) throws Exception {
		categoryDao.insertCategory(categoryVo);
	}

	@Override
	public List<Map<String, Object>> getCategoryList() {
		return categoryDao.getCategoryList();
	}

	@Override
	public Map<String, Object> getCategoryInfo(Map<String, Object> parmas) {
		return categoryDao.getCategoryInfo(parmas);
	}
}
