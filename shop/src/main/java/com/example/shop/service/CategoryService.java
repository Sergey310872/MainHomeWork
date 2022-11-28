package com.example.shop.service;

import com.example.shop.dto.CategoryCreateDto;
import com.example.shop.persistence.entity.Category;
import com.example.shop.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category createCategory(CategoryCreateDto dto) {
        return categoryRepository.save(new Category(dto.getId(), dto.getName(), dto.getParent_id()));
    }
}
