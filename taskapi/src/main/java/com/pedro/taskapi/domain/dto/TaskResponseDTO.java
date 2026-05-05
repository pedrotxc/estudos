package com.pedro.taskapi.domain.dto;

import com.pedro.taskapi.domain.model.Task;

public record TaskResponseDTO(Long id, String name, String description) {

    public TaskResponseDTO(Task task) {
        this(task.getId(), task.getName(), task.getDescription());
    }
}
