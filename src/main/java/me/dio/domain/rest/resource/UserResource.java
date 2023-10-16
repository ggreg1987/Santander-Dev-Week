package me.dio.domain.rest.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import me.dio.domain.entity.User;
import me.dio.domain.rest.dto.UserDTO;
import me.dio.domain.rest.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserResource {

    private final UserService service;
    private final ObjectMapper mapper;

    public UserDTO save(@RequestBody User user) {
        var entity = service.create(user);
        var dto = mapper.convertValue(entity,UserDTO.class);
        return dto;
    }
}
