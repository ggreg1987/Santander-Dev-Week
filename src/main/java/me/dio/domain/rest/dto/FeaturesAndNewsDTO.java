package me.dio.domain.rest.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class FeaturesAndNewsDTO implements Serializable {

    private Long id;
    private String icon;
    private String description;
}
