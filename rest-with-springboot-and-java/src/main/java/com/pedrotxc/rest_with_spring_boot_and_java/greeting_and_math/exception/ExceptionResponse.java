package com.pedrotxc.rest_with_spring_boot_and_java.greeting_and_math.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details){}
