package org.anse.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.anse.service.BoardService;
import org.anse.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/boardList/{ctgId}/{ctgDepth}", method=RequestMethod.GET)
	public String boardList( Model model, @PathVariable("ctgId") String ctgId, @PathVariable("ctgDepth") String ctgDepth ) throws Exception {
		// 1. 카테고리 리스트 조회
		List<Map<String,Object>> categoryList = new ArrayList<>();
		categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		
		
		Map<String, Object> params = new HashMap<>();	
		params.put("ctgId", ctgId);
		params.put("ctgDepth", ctgDepth);

		// 2. 클릭한 카테고리 정보
		Map<String,Object> categoryInfo = categoryService.getCategoryInfo(params);

		// 3. 카테고리 별 게시글 리스트 조회
		List<Map<String,Object>> boardList = new ArrayList<>();
				
		boardList = boardService.getBoardList(params);

		
		model.addAttribute("boardList", boardList);
		model.addAttribute("categoryInfo", categoryInfo);
		
		return "board/boardList";
	}
	
	@RequestMapping(value="/bootTest", method=RequestMethod.GET)
	public String bootTest( Model model ) throws Exception {
		model.addAttribute("boardList", "aaa");
		
		return "board/bootTest";
		//return "board/bootTest";
	}
}
