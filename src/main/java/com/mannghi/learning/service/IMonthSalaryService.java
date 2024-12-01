package com.mannghi.learning.service;

import com.mannghi.learning.entity.MonthSalary;

import java.util.Optional;

/**
 * @author ManNghi
 * @since 27/11/2024 - 20:33
 */
public interface IMonthSalaryService {

    Optional<MonthSalary> getMonthSalary(long id);
}
