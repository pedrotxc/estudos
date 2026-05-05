package com.pedro.taskapi.controller;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import com.pedro.taskapi.domain.dto.TaskResponseDTO;
import com.pedro.taskapi.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void saveTask(@RequestBody TaskRequestDTO task) {
        TaskResponseDTO response = taskService.saveTask(task);

        System.out.println(response);
    }
}
