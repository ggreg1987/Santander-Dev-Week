package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class CardDTO
        extends RepresentationModel<CardDTO> implements Serializable {

    private Long id;
    private String number;
    private BigDecimal limit;
}
