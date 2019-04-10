package com.kpi.distributed.calculation.service.impl;

import com.kpi.distributed.calculation.model.dto.CalculatedDataDTO;
import com.kpi.distributed.calculation.model.entity.CalculatedData;
import com.kpi.distributed.calculation.repository.CalculatedDataRepository;
import com.kpi.distributed.calculation.service.CalculatedDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.stream.StreamSupport.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class CalculatedDataServiceImpl implements CalculatedDataService {

    private final CalculatedDataRepository calculatedDataRepository;

    @Override
    public List<CalculatedDataDTO> findAll() {
        return stream(this.calculatedDataRepository.findAll().spliterator(), false)
                .map(res -> CalculatedDataDTO.builder()
                        .value(res.getValue())
                        .description(res.getDescription())
                        .date(res.getDate()).build())
                .collect(toList());
    }

    @Override
    public void saveData(CalculatedDataDTO calculatedData) {
        CalculatedData body = new CalculatedData(calculatedData.getValue(), calculatedData.getDescription());
        this.calculatedDataRepository.save(body);
    }

    @Override
    public void saveDataList(List<CalculatedDataDTO> calculatedDataList) {
        List<CalculatedData> body = calculatedDataList.stream()
                .map(data -> new CalculatedData(data.getValue(), data.getDescription()))
                .collect(toList());
        this.calculatedDataRepository.saveAll(body);
    }
}