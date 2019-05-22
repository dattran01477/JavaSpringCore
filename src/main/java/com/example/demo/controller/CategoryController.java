package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategoryDao;
import com.example.demo.model.Category;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryDao categoryDao;

	@GetMapping(value = "/")
	public String  getMethodName() {
		Category category=new Category();
		category.setName("abc");

		categoryDao.save(category);
	return "xin chao";
	}


}
