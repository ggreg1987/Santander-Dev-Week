package me.dio.domain.rest.service.impl;

import lombok.RequiredArgsConstructor;
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
    public User findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }
}
