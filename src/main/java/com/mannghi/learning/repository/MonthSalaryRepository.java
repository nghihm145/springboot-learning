package com.mannghi.learning.repository;

import com.mannghi.learning.entity.MonthSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 27/11/2024 - 20:41
 */
@Repository
public interface MonthSalaryRepository extends JpaRepository <MonthSalary, Long> {
}
