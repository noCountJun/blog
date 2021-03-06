package org.anse.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.anse.vo.CategoryVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CateogryDAOImpl implements CategoryDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace = "mapper.CategoryMapper";
	
	@Override
	public void insertCategory(CategoryVO categoryVo) throws Exception {
		sqlSession.insert(nameSpace+".insertCategory", categoryVo);
	}
	
	@Override
	public List<Map<String, Object>> getCategoryList() {
		return sqlSession.selectList(nameSpace+".getCategoryList");
	}

	@Override
	public Map<String, Object> getCategoryInfo(Map<String, Object> parmas) {
		return sqlSession.selectOne(nameSpace+".getCategoryInfo", parmas);
	}

}
