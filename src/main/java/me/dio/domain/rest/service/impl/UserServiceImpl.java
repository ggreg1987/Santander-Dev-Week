package me.dio.domain.rest.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.controller.exception.AlreadyExistsException;
import me.dio.controller.exception.CantFindIdException;
import me.dio.domain.entity.User;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.rest.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new CantFindIdException("Id not exists"));
    }

    @Override
    public User create(User user)  {
        var userChecked = existsAccount(user);
        return repository.save(userChecked);
    }

    private User existsAccount(User user)  {
        if(repository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new AlreadyExistsException("This Account number already exists.");
        } else {
            return user;
        }
    }
}
