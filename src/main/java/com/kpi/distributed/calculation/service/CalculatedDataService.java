package com.kpi.distributed.calculation.service;

import com.kpi.distributed.calculation.model.dto.CalculatedDataDTO;

import java.util.List;

public interface CalculatedDataService {

    List<CalculatedDataDTO> findAll();

    void saveData(CalculatedDataDTO calculatedData);

    void saveDataList(List<CalculatedDataDTO> calculatedDataList);
}
