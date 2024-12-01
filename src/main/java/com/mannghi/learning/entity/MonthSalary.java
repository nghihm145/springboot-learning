package com.mannghi.learning.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "month_salary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonthSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Relationships
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;

    @OneToMany(mappedBy = "monthSalary", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference // Serialize this field from MonthSalary's perspective
    private List<Expenses> expenses;

}
