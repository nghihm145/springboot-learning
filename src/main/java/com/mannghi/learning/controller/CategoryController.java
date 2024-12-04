package com.mannghi.learning.controller;

import com.mannghi.learning.entity.Category;
import com.mannghi.learning.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ManNghi
 * @since 04/12/2024 - 19:58
 */
@RestController
@RequestMapping("/category")

public class CategoryController {
    private final ICategoryService categoryService;
    public CategoryController (ICategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/get-all-category")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @PostMapping("/create-category")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

}
