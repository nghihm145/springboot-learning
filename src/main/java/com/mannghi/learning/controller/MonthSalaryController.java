package com.mannghi.learning.controller;


import com.mannghi.learning.entity.MonthSalary;
import com.mannghi.learning.service.IMonthSalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author ManNghi
 * @since 27/11/2024 - 09:53
 */
@RestController
@RequestMapping("/month-salary")

public class MonthSalaryController {
    private final IMonthSalaryService monthSalaryService;
    public MonthSalaryController(IMonthSalaryService monthSalaryService){
        this.monthSalaryService = monthSalaryService;
    }
    @GetMapping("/get-month-salary-user-by-id/{id}")
    public Optional<MonthSalary> getSalaryUserById(@PathVariable long id){
        return monthSalaryService.getMonthSalary(id);
    }
}
