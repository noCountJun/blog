package org.anse.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.anse.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHome( Model model ) throws Exception {
		List<Map<String,Object>> categoryList = new ArrayList<>();
		categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		
		return "main/home";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String getProfile( Model model ) throws Exception {
		List<Map<String,Object>> categoryList = new ArrayList<>();
		categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		
		return "main/profile";
	}
}
