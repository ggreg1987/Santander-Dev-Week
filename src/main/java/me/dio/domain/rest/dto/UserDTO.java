package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.dio.domain.entity.Account;
import me.dio.domain.entity.Card;
import me.dio.domain.entity.Features;
import me.dio.domain.entity.News;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
public class UserDTO
        extends RepresentationModel<UserDTO> implements Serializable {

    private Long id;
    private String name;
    private AccountDTO account;
    private CardDTO card;
    private List<FeaturesDTO> features;
    private List<NewsDTO> news;

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
