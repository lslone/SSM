package com.lsl.ssm.mapper;

import org.springframework.stereotype.Repository;

import com.lsl.ssm.pojo.Category;

@Repository
public interface CategoryMapper {
	Category getCategoryById(Integer id);
}
