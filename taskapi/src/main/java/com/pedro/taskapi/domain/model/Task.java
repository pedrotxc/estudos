package com.pedro.taskapi.domain.model;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {

    private Long id;
    private String name;
    private String description;

    public Task(TaskRequestDTO dto) {
        this.name = dto.name();
        this.description = dto.description();
    }
}
