package com.mspoc.users.exception;

import com.mspoc.users.model.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { NotEvenNumberException.class })
    protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {

        return handleExceptionInternal(ex, ApiError.builder().code(333L).description("not even number").build(),
                new HttpHeaders(), HttpStatus.CONFLICT, request);

//        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}
