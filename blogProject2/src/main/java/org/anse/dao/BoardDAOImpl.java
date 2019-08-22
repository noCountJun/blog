package org.anse.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace = "mapper.BoardMapper";
	
	
	@Override
	public List<Map<String, Object>> getBoardList(Map<String, Object> params) {
		return sqlSession.selectList(nameSpace+".getBoardList", params);
		
	}

}
