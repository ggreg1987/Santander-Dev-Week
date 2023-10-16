package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
