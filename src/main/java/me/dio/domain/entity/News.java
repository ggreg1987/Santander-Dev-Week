package me.dio.domain.entity;

import jakarta.persistence.Entity;
import lombok.Builder;

import java.io.Serializable;

@Builder
@Entity(name = "tb_news")
public class News extends FeaturesAndNews implements Serializable {
}
