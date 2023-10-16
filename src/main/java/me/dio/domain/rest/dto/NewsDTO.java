package me.dio.domain.rest.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class NewsDTO extends FeaturesAndNewsDTO implements Serializable {
}
