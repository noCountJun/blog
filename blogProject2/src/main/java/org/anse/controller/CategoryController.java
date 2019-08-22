package org.anse.controller;

import org.anse.vo.CategoryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/category")
public class CategoryController {

	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@RequestMapping(value="/insertCategory", method=RequestMethod.POST)
	public String insertCategory(CategoryVO categoryVo, Model model) throws Exception {
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
//		categoryService.insertCategory(categoryVo);
//		model.addAttribute("result", "success");
		
		return "/board/success";
	}
}
