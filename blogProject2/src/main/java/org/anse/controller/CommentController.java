package org.anse.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anse.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService commentService;

	
	/**
	 * 게시글 상세의 댓글리스트를 조회
	 * @param params
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/selectCommentListAjax", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> selectCommentListAjax(@RequestParam Map<String, Object> params , Model model) throws Exception {
		List<Map<String,Object>> commentList = commentService.getCommentList(params);
		params.put("commentList", commentList);
		
		return params;
	}
	
	/**
	 * 댓글 등록
	 * @param params
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/insertCommentAjax", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> insertCommentAjax(@RequestParam Map<String,Object> params, Model model) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();

		commentService.insertComment(params);
		
		return map;
	}	
	
	
	
	@RequestMapping(value="/updateDelCommentAjax", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> updateDelCommentAjax(@RequestParam Map<String,Object> params, Model model) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();

		int resultCd = commentService.updateDelComment(params);
		
		map.put("resultCd", resultCd);
		
		return map;
	}	
	
	
}
