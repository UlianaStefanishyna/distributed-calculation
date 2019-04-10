package com.kpi.distributed.calculation.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@EqualsAndHashCode(of = "id")
@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CalculatedData {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double value;

    private String description;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();

    public CalculatedData(Double value, String description) {
        this.value = value;
        this.description = description;
    }
}