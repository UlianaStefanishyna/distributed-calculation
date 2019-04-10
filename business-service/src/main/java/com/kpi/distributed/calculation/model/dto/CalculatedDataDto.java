package com.kpi.distributed.calculation.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class CalculatedDataDto {

    private Double value;
    private String description;
    private LocalDateTime date;
}