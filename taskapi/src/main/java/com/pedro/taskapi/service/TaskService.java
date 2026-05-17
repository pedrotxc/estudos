package com.pedro.taskapi.service;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import com.pedro.taskapi.domain.dto.TaskResponseDTO;
import com.pedro.taskapi.domain.model.Task;
import com.pedro.taskapi.mapper.TaskMapper;
import com.pedro.taskapi.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public TaskResponseDTO createTask(TaskRequestDTO request) {
        Task entity = TaskMapper.toEntity(request);
        return TaskMapper.toResponse(repository.save(entity));
    }

    public TaskResponseDTO getTaskById(Long id) {
        Task task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task nao encontrada"));
        return TaskMapper.toResponse(task);
    }

    public List<Task> getAllTasks() {
        List<Task> tasks = repository.findAll();
        return tasks;
    }

    @Transactional
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO taskRequest) {
        Task task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task nao encontrada"));
        task.updateInfo(taskRequest.name(), taskRequest.description());
        Task taskSaved = repository.save(task);
        return TaskMapper.toResponse(taskSaved);
    }

    public void deleteTask(Long id) {
        Task task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task nao encontrada"));
        repository.delete(task);
    }
}
