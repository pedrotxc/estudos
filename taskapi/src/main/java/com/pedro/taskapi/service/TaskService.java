package com.pedro.taskapi.service;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import com.pedro.taskapi.domain.dto.TaskResponseDTO;
import com.pedro.taskapi.domain.model.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public TaskResponseDTO saveTask(TaskRequestDTO dto) {
        Task task = new Task(dto);
        task.setId(1L);
        return new TaskResponseDTO(task);
    }
}
