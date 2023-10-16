package me.dio.domain.rest.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import me.dio.domain.entity.User;
import me.dio.domain.rest.dto.UserDTO;
import me.dio.domain.rest.service.UserService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserResource {

    private final UserService service;
    private final ObjectMapper mapper;

    @PostMapping(produces = APPLICATION_JSON_VALUE,consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(CREATED)
    public UserDTO save(@RequestBody User user) {
        var entity = service.create(user);
        var dto = mapper.convertValue(entity,UserDTO.class);
        return dto;
    }

    @GetMapping(value = "{id}",produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(OK)
    public UserDTO findById(@PathVariable Long id) {
        var entity = service.findById(id);
        var dto = mapper.convertValue(entity,UserDTO.class);
        return dto;
    }
}
