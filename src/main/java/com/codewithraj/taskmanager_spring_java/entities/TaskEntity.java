package com.codewithraj.taskmanager_spring_java.entities;

import lombok.Data;

import java.util.Date;

@Data
public class TaskEntity {
    private int id;
    private String title;
    private String description;
    private Date deadline;
    private boolean completed;
}

