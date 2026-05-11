package com.pedro.taskapi.domain.model;

import com.pedro.taskapi.domain.dto.TaskRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Task(TaskRequestDTO dto) {
        this.name = dto.name();
        this.description = dto.description();
    }
}
