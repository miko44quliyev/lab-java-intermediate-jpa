package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "internal_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {

    public InternalTask(String title, LocalDateTime dueDate, Boolean status) {
        super(title, dueDate, status);
    }
    public InternalTask() {}

}
