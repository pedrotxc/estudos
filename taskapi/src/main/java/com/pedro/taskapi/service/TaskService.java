package com.pedro.taskapi.service;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import com.pedro.taskapi.domain.dto.TaskResponseDTO;
import com.pedro.taskapi.domain.model.Task;
import com.pedro.taskapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskResponseDTO saveTask(TaskRequestDTO dto) {
        Task task = new Task(dto);
        return new TaskResponseDTO(repository.save(task));
    }
}
