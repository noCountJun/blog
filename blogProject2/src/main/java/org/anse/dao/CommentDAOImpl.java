package org.anse.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDAOImpl implements CommentDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace = "mapper.CommentMapper";
	
	
	@Override
	public List<Map<String, Object>> getCommentList(Map<String, Object> params) {
		return sqlSession.selectList(nameSpace+".getCommentList", params);
	}

	@Override
	public void insertComment(Map<String, Object> params) {
		sqlSession.insert(nameSpace+".insertComment", params);
	}
	
	@Override
	public int getMatchCommentCount(Map<String, Object> params) {
		return sqlSession.selectOne(nameSpace+".getMatchCommentCount", params);
	}
	
	@Override
	public void updateDelComment(Map<String, Object> params) {
		sqlSession.update(nameSpace+".updateDelComment", params);
	}
}
