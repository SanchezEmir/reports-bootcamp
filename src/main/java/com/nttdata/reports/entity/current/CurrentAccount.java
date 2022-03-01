package com.nttdata.reports.entity.current;

import java.time.LocalDateTime;
import java.util.List;

import com.nttdata.reports.entity.customer.Customer;
import com.nttdata.reports.entity.customer.Managers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount {

  private String id;

  private Customer customer;

  private String cardNumber;

  private Integer freeTransactions;

  private Double commissionTransactions;

  private Double commissionMaintenance;

  private Double balance;

  private LocalDateTime createAt;

  private List<Managers> owners;

  private List<Managers> signatories;

}
