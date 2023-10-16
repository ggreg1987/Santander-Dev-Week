package me.dio.domain.rest.dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Data
public abstract class FeaturesAndNewsDTO implements Serializable {

    private Long id;
    private String icon;
    private String description;
}
