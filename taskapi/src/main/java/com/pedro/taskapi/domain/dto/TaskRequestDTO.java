package com.pedro.taskapi.domain.dto;

import com.pedro.taskapi.domain.model.Task;

public record TaskRequestDTO(String name, String description) {

    public TaskRequestDTO(Task task) {
        this(task.getName(), task.getDescription());
    }
}
