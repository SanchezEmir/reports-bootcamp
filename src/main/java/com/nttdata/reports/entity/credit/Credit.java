package com.nttdata.reports.entity.credit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nttdata.reports.entity.enums.EStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

  private String id;

  private CreditCard creditCard;

  private EStatus status;

  private Double amount;

  private LocalDateTime date;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate expirationDate;

}
