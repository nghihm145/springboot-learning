package com.mannghi.learning.repository;

import com.mannghi.learning.entity.MonthSalary;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 27/11/2024 - 20:41
 */
@Repository
public interface MonthSalaryRepository extends JpaRepository<MonthSalary, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE MonthSalary m Set m.description = :description WHERE m.id = :id")
    void updateMonthSalaryById(@Param("id") long id,
                               @Param("description") String description);
}
