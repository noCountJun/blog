package org.anse.service;

import java.util.List;
import java.util.Map;

import org.anse.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDao;
	

	@Override
	public List<Map<String, Object>> getBoardList(Map<String, Object> params) {
		return boardDao.getBoardList(params);
	}

	@Override
	public Map<String, Object> getBoardInfo(Map<String, Object> params) {
		return boardDao.getBoardInfo(params);
	}
	
	@Override
	public void updateViewCnt(Map<String, Object> params) {
		boardDao.updateViewCnt(params);
	}
}
