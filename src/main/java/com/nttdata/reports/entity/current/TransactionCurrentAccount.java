package com.nttdata.reports.entity.current;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.nttdata.reports.entity.enums.ETypeTransaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCurrentAccount {

  @Id
  private String id;

  @NotNull
  private CurrentAccount currentAccount;

  @NotBlank
  private String transactionCode;

  @Valid
  private ETypeTransaction typeTransaction;

  @NotNull
  private Double transactionAmount;

  private Double commissionAmount;

  private LocalDateTime transactionDate;

}
