package com.mannghi.learning.repository;

import com.mannghi.learning.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ManNghi
 * @since 04/12/2024 - 20:03
 */
public interface CategoryRepository extends JpaRepository <Category, Long>{
}
