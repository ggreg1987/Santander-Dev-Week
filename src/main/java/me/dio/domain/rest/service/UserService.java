package me.dio.domain.rest.service;

import me.dio.controller.exception.CantFindIdException;
import me.dio.domain.entity.User;

public interface UserService {

    User findById(Long id) throws CantFindIdException;

    User create(User user);
}
