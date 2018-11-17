package com.lsl.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsl.ssm.mapper.CategoryMapper;
import com.lsl.ssm.pojo.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryMapper eMapper;
	
	public CategoryService() {
		System.out.println("CategoryService 被创建了！");
	}
	
	public Category hello(Integer id) {
		
		Category category = eMapper.getCategoryById(id);
		
		return category;
	}
}
