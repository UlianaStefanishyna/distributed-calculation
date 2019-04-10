package com.kpi.distributed.calculation.presentation;

import com.kpi.distributed.calculation.model.business.BasicDto;
import com.kpi.distributed.calculation.model.business.TaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/info")
public class WorkerDataPresentation {

    @GetMapping
    public ResponseEntity<TaskDto> getInfo(@RequestParam Double percent, @RequestParam String isChargingNow,
                                           @RequestParam int cores) {
        log.info("{} : isChargingNow: {} | percent is : {} | cores number is : {}",
                LocalDateTime.now(), isChargingNow, percent, cores);
        TaskDto build = TaskDto.builder().iterationCount(100_000_000L).build();
        log.info("build={}", build);
        return ResponseEntity.ok(build);
    }

    @PostMapping
    public ResponseEntity<BasicDto> result(@RequestParam Double sum) {
        log.info("sum={}", sum);
        return ResponseEntity.ok(new BasicDto());
    }
}