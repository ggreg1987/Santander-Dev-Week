package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class AccountDTO
        extends RepresentationModel<AccountDTO> implements Serializable {


    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;
}
