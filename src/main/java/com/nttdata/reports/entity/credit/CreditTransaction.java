package com.nttdata.reports.entity.credit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CreditTransaction {
  
  private String id;
  
  private Credit credit;
  
  private String transactionCode;
  
  private Double transactionAmount;
  
  private LocalDateTime transactionDate;
  
}
