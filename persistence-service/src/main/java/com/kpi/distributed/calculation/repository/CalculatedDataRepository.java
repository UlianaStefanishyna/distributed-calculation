package com.kpi.distributed.calculation.repository;

import com.kpi.distributed.calculation.model.entity.CalculatedData;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CalculatedDataRepository extends PagingAndSortingRepository<CalculatedData, Long> {
}