package com.mannghi.learning.controller;


import com.mannghi.learning.entity.MonthSalary;
import com.mannghi.learning.service.IMonthSalaryService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete-month-salary-by-id/{id}")
    public void deleteMonthSalary(@PathVariable long id){
        monthSalaryService.deleteMonthSalaryById();
    }

    @PostMapping("/add-new-month-salary-by-id/{id}")
    public Optional<MonthSalary> addNewMonthSalaryById(@PathVariable long id, @RequestBody MonthSalary monthSalary) {
        return monthSalaryService.addNewMonthSalaryById(monthSalary);

    }
    @PutMapping("/update-month-salary-by-id/{id}")
    public void updateMonthSalaryById(@PathVariable long id, @RequestBody MonthSalary monthSalary){
        monthSalaryService.updateMonthSalaryById(monthSalary);
    }
}
