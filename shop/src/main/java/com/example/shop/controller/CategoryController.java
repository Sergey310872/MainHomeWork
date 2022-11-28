package com.example.shop.controller;

import com.example.shop.dto.CategoryCreateDto;
import com.example.shop.persistence.entity.Category;
import com.example.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public Category createdCategoryDto(@RequestBody CategoryCreateDto dto){
        return  categoryService.createCategory(dto);
    }
}
