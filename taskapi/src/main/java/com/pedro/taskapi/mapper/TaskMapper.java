package com.pedro.taskapi.mapper;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import com.pedro.taskapi.domain.dto.TaskResponseDTO;
import com.pedro.taskapi.domain.model.Task;

public final class TaskMapper {

    private TaskMapper() {
    }

    public static Task toEntity(TaskRequestDTO request) {
        return new Task(request.name(), request.description());
    }

    public static TaskResponseDTO toResponse(Task task) {
        return new TaskResponseDTO(task.getId(), task.getName(), task.getDescription());
    }
}
