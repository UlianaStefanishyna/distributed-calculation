package com.kpi.distributed.calculation.presentation;

import com.kpi.distributed.calculation.model.business.BasicDto;
import com.kpi.distributed.calculation.model.dto.CalculatedDataDTO;
import com.kpi.distributed.calculation.model.entity.CalculatedData;
import com.kpi.distributed.calculation.service.CalculatedDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class CalculatedDataPresentation {

    private final CalculatedDataService calculatedDataService;

    @GetMapping
    public ResponseEntity<List<CalculatedDataDTO>> findAll() {
        return ResponseEntity.ok(this.calculatedDataService.findAll());
    }

    @PostMapping
    public ResponseEntity<BasicDto> addDataList(@RequestBody List<CalculatedDataDTO> calculatedDataList) {
        this.calculatedDataService.saveDataList(calculatedDataList);
        return ResponseEntity.ok(new BasicDto());
    }
}