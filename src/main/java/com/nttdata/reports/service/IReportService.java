package com.nttdata.reports.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.nttdata.reports.entity.credit.Credit;
import com.nttdata.reports.entity.credit.CreditCard;
import com.nttdata.reports.entity.credit.CreditTransaction;
import com.nttdata.reports.entity.current.CurrentAccount;
import com.nttdata.reports.entity.current.TransactionCurrentAccount;
import com.nttdata.reports.entity.customer.Customer;
import com.nttdata.reports.entity.fixedterm.FixedTerm;
import com.nttdata.reports.entity.fixedterm.TransactionFixedTerm;
import com.nttdata.reports.entity.saving.SavingAccount;
import com.nttdata.reports.entity.saving.SavingAccountTransaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IReportService {

  // CUSTOMER
  public Mono<Customer> findCustomerByIdCustomer(String id);

  // CREDIT
  public Flux<CreditCard> findCreditCards();
  public Flux<Credit> findCreditByIdCreditCard(String id);
  public Flux<CreditTransaction> FindCreditPayByIdCreditCard(String id);
  public Flux<CreditCard> findCreditCardByIdCustomer(String id);

  // FIXED
  public Flux<FixedTerm> findFixeds();
  public Flux<TransactionFixedTerm> findTransactionFixedByIdFixed(String id);
  public Flux<FixedTerm> findFixedTermByIdCustomer(String id);

  // CURRENT
  public Flux<CurrentAccount> findCurrents();
  public Flux<TransactionCurrentAccount> findTransactionCurrentByIdCurrent(String id);
  public Flux<CurrentAccount> findCurrentAccountByIdCustomer(String id);

  // SAVING
  public Flux<SavingAccount> findSavings();
  public Flux<SavingAccountTransaction> findTransactionSavingsByIdSaving(
      String id);
  public Flux<SavingAccount> findSavingAccountByIdCustomer(String id);

  // TOOL
  boolean isWithInRange(LocalDateTime createAt, LocalDate start, LocalDate end);

}
