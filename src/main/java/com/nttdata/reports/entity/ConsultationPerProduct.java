package com.nttdata.reports.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ConsultationPerProduct {

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate startDate;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate endingDate;

}
