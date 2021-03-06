package org.anse.web;

import org.anse.vo.CategoryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleContoller {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleContoller.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called----------------------------");
	}
	
	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg) {	// doC?msg=testStr
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(Model model) {
//		CategoryVO ctgVo = new CategoryVO("testtest","aaaa");
		CategoryVO ctgVo = null;
		model.addAttribute("ctgVOO" ,ctgVo);	//ctgVOO 에 ctgVo담김
		return "result";
	}
	
	// 리다이렉트
	@RequestMapping("doE") 
	public String doE(RedirectAttributes rttr) {
	
		rttr.addFlashAttribute("msg", "gogo Redirect Msg!");
		return "redirect:/doF";
	}
	@RequestMapping("doF") 
	public void doF(@ModelAttribute("msg") String msg) {
		logger.info("doF called----------------------------" + msg);
	}
	
	
	
	// json	localhost:8080/web/doJSON
	@RequestMapping("/doJSON") 
	public @ResponseBody CategoryVO doJSON() {
//		CategoryVO ctgVo = new CategoryVO("testtest","aaaa");
		CategoryVO ctgVo = null;
		return ctgVo;
	}
	
	
	
}
