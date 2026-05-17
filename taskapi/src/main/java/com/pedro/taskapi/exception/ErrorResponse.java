package com.pedro.taskapi.exception;

public record ErrorResponse(int status, String error, String message, String path) {
}
