package com.nttdata.reports.entity.credit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CreditCard {
  
  private String id;
  
  private String cardNumber;
  
  private String accountNumber;
  
  private Double limitCredit;
  
  private LocalDate expiration;
  
  private LocalDateTime createAt;
  
}
