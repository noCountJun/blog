package org.anse.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.anse.service.BoardService;
import org.anse.service.CategoryService;
import org.anse.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private CommentService commentService;


	/**
	 * �Խñ� ��
	 * @param model
	 * @param brdId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String boardDetail( Model model) throws Exception {

		// 1. ī�װ� ����Ʈ ��ȸ (LNB)
		List<Map<String,Object>> categoryList = new ArrayList<>();
		categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		
		return "login/loginForm";
	}
	
}
