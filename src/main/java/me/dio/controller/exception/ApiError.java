package me.dio.controller.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class ApiError {

    private List<String> errors;

    public ApiError(List<String> errors) {
        this.errors = errors;
    }

    public ApiError(String msgError) {
        this.errors = Arrays.asList(msgError);
    }
}
