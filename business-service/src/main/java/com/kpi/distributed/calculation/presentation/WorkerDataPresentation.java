package com.kpi.distributed.calculation.presentation;

import com.kpi.distributed.calculation.model.business.BasicDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/info")
public class WorkerDataPresentation {

    @GetMapping
    public ResponseEntity<BasicDto> getInfo(@RequestParam Double percent, @RequestParam String isChargingNow,
                                            @RequestParam int cores) {
        log.info("{} : isChargingNow: {} , percent is : {}, cores is : {}",
                LocalDateTime.now(), isChargingNow, percent, cores);
        return ResponseEntity.ok(new BasicDto());
    }
}