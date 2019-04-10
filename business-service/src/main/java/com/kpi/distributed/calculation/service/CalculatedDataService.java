package com.kpi.distributed.calculation.service;

import com.kpi.distributed.calculation.model.dto.CalculatedDataDto;

import java.util.List;

public interface CalculatedDataService {

    void saveDataList(List<CalculatedDataDto> calculatedDataList);

    List<CalculatedDataDto> findAll();
}