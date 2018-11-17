package com.lsl.ssm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsl.ssm.pojo.Category;
import com.lsl.ssm.service.CategoryService;

@Controller
public class CategoryHandler {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/hello")
	public String handle(Integer id,Model model) {
		
		Category employee = service.hello(id);
		
		model.addAttribute("e", employee);
		
		System.out.println("CategoryHandler 处理 hello请求！");
		
		return "success";
		
	}
}
