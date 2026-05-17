package com.pedro.taskapi.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(
        @NotBlank(message = "Name é obrigatório") String name,
        @NotBlank(message = "Description é obrigatório") String description
) {

}
