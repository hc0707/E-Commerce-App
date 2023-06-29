package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	public void createCategory(Category category) {
		categoryRepo.save(category);
	}
}
