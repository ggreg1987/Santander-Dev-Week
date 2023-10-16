package me.dio.domain.entity;

import jakarta.persistence.Entity;
import lombok.Builder;

import java.io.Serializable;

@Builder
@Entity(name = "tb_features")
public class Features extends FeaturesAndNews implements Serializable {
}
