package me.dio.domain.rest.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.controller.exception.AlreadyExistsException;
import me.dio.controller.exception.CantFindIdException;
import me.dio.domain.entity.User;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.rest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) throws CantFindIdException {
        return repository
                .findById(id)
                .orElseThrow(() -> new CantFindIdException("Id not exists"));
    }

    @Override
    public User create(User user) throws AlreadyExistsException {
        var userChecked = existsAccount(user);
        return repository.save(userChecked);
    }

    private User existsAccount(User user) throws AlreadyExistsException {
        if(repository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new AlreadyExistsException("This Account number already exists.");
        } else {
            return user;
        }
    }
}
