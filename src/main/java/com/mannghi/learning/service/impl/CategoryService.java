package com.mannghi.learning.service.impl;

import com.mannghi.learning.entity.Category;
import com.mannghi.learning.repository.CategoryRepository;
import com.mannghi.learning.service.ICategoryService;

import java.util.List;

/**
 * @author ManNghi
 * @since 04/12/2024 - 19:56
 */
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService (CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
