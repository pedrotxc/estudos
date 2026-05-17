package com.pedro.taskapi.exception;

public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(String mensagem) {
        super(mensagem);
    }
}
