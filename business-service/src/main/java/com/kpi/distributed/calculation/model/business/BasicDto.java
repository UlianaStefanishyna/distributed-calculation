package com.kpi.distributed.calculation.model.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicDto {

    private boolean success = true;
    private String description = "ok";
}