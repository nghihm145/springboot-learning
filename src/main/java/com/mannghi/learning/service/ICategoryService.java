package com.mannghi.learning.service;

import com.mannghi.learning.entity.Category;

import java.util.List;

/**
 * @author ManNghi
 * @since 04/12/2024 - 19:56
 */
public interface ICategoryService {

    List<Category> getAllCategory();

    Category createCategory (Category category);
}
