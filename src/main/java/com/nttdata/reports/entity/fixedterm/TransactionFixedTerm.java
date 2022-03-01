package com.nttdata.reports.entity.fixedterm;

import java.time.LocalDateTime;

import com.nttdata.reports.entity.enums.ETypeTransaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionFixedTerm {

  private String id;

  private FixedTerm fixedTerm;

  private String transactionCode;

  private ETypeTransaction typeTransaction;

  private Double transactionAmount;

  private Double commissionAmount;

  private LocalDateTime transactionDateTime;

}
