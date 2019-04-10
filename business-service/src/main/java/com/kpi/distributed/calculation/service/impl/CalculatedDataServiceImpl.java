package com.kpi.distributed.calculation.service.impl;

import com.kpi.distributed.calculation.model.dto.CalculatedDataDto;
import com.kpi.distributed.calculation.model.entity.CalculatedData;
import com.kpi.distributed.calculation.repository.CalculatedDataRepository;
import com.kpi.distributed.calculation.service.CalculatedDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.stream.StreamSupport.*;

@Service
@RequiredArgsConstructor
public class CalculatedDataServiceImpl implements CalculatedDataService {

    private final CalculatedDataRepository calculatedDataRepository;

    @Override
    public List<CalculatedDataDto> findAll() {
        return stream(this.calculatedDataRepository.findAll().spliterator(), false)
                .map(res -> CalculatedDataDto.builder()
                        .value(res.getValue())
                        .description(res.getDescription())
                        .date(res.getDate()).build())
                .collect(toList());
    }

    @Override
    public void saveDataList(List<CalculatedDataDto> calculatedDataList) {
        List<CalculatedData> body = calculatedDataList.stream()
                .map(data -> new CalculatedData(data.getValue(), data.getDescription()))
                .collect(toList());
        this.calculatedDataRepository.saveAll(body);
    }
}