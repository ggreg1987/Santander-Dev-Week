package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class UserDTO
        extends RepresentationModel<UserDTO> implements Serializable {

    private Long id;
    private String name;
    private AccountDTO accountDTO;
    private CardDTO cardDTO;
    private List<FeaturesDTO> featuresDTO;
    private List<NewsDTO> newsDTO;
}
