package com.mannghi.learning.service.impl;

import com.mannghi.learning.entity.MonthSalary;
import com.mannghi.learning.repository.MonthSalaryRepository;
import com.mannghi.learning.service.IMonthSalaryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author ManNghi
 * @since 27/11/2024 - 20:32
 */
@Service
public class MonthSalaryService implements IMonthSalaryService {
private final MonthSalaryRepository monthSalaryRepository;

    public MonthSalaryService(MonthSalaryRepository monthSalaryRepository) {
        this.monthSalaryRepository = monthSalaryRepository;
    }

    @Override
    public Optional<MonthSalary> getMonthSalary(long id) {
        return monthSalaryRepository.findById(id);
    }
}
