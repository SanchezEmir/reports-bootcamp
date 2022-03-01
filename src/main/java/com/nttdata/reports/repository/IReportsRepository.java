package com.nttdata.reports.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.reports.entity.ReportGeneral;

public interface IReportsRepository extends ReactiveMongoRepository<ReportGeneral, String> {
  
  
  
}
