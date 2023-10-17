package me.dio.controller.exception;

public class CantFindIdException extends RuntimeException {

    public CantFindIdException(String message) {
        super(message);
    }
}
