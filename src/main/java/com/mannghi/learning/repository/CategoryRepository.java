package com.mannghi.learning.repository;

import com.mannghi.learning.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 04/12/2024 - 20:03
 */
@Repository
public interface CategoryRepository extends JpaRepository <Category, Long>{
}
