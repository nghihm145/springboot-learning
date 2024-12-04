package com.mannghi.learning.service;

import com.mannghi.learning.entity.MonthSalary;

import java.util.Optional;

/**
 * @author ManNghi
 * @since 03/12/2024 - 20:49
 */
public interface IMonthSalaryService {

    Optional<MonthSalary> getMonthSalary(long id);

    void deleteMonthSalaryById();

    Optional<MonthSalary> addNewMonthSalaryById(MonthSalary monthSalary);

    void updateMonthSalaryById(MonthSalary monthSalary);
}
