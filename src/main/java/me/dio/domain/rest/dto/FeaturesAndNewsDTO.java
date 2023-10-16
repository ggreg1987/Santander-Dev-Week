package me.dio.domain.rest.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public abstract class FeaturesAndNewsDTO implements Serializable {

    private Long id;
    private String icon;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeaturesAndNewsDTO that = (FeaturesAndNewsDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
