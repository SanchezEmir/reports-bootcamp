package com.nttdata.reports.entity;

import java.util.List;

import com.nttdata.reports.entity.credit.CreditCard;
import com.nttdata.reports.entity.current.CurrentAccount;
import com.nttdata.reports.entity.customer.Customer;
import com.nttdata.reports.entity.fixedterm.FixedTerm;
import com.nttdata.reports.entity.saving.SavingAccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportGeneral {

  private Customer customer;

  private List<CreditCard> creditCards;

  private List<CurrentAccount> currentsAccounts;

  private List<SavingAccount> savingAccounts;

  private List<FixedTerm> fixedTermAccounts;
}
