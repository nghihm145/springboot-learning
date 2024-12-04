package com.mannghi.learning.entity;

/**
 * @author ManNghi
 * @since 03/12/2024 - 20:53
 */
public class MonthSalaryRequest {
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    private String month;
    private long salary;

}
