package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "billable_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task {
    @Column(nullable = false)
    private Double hourlyRate;

    public BillableTask() {
    }
    public BillableTask(String title, LocalDateTime dueDate, Boolean status, Double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
