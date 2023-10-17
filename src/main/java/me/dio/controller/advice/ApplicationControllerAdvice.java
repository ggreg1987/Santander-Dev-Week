package me.dio.controller.advice;

import me.dio.controller.exception.AlreadyExistsException;
import me.dio.controller.exception.ApiError;
import me.dio.controller.exception.CantFindIdException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(CantFindIdException.class)
    @ResponseStatus(NOT_FOUND)
    public ApiError handleFindByIdException(CantFindIdException ex) {
        return message(ex);
    }

    @ExceptionHandler(AlreadyExistsException.class)
    @ResponseStatus(UNPROCESSABLE_ENTITY)
    public ApiError handleAlreadyExistsException(AlreadyExistsException ex) {
        return message(ex);
    }

    private ApiError message(Exception ex) {
        var message = ex.getMessage();
        return new ApiError(message);
    }
}
