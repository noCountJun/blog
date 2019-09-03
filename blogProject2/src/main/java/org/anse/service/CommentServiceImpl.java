package org.anse.service;

import java.util.List;
import java.util.Map;

import org.anse.dao.CommentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDAO commentDao;
	

	@Override
	public List<Map<String, Object>> getCommentList(Map<String, Object> params) {
		return commentDao.getCommentList(params);
	}

	@Override
	public void insertComment(Map<String, Object> params) {
		commentDao.insertComment(params);
	}

	@Override
	public int updateDelComment(Map<String, Object> params) {
		// step1. �����ϰ��� �ϴ� ��� ��й�ȣ Ȯ��
		int cmtCount = commentDao.getMatchCommentCount(params);
		
		// ����� ���� ����
		if(cmtCount == 0) {
			return 0;
			
		} else {
			
			// setp2. ����
			commentDao.updateDelComment(params);
			return 1;
		}
		
	}

}