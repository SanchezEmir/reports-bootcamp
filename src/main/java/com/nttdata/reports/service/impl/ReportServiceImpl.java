package com.nttdata.reports.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

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
import com.nttdata.reports.service.IReportService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReportServiceImpl implements IReportService {

  private final WebClient webClient;

  @Value("${config.base.apigateway}")
  private String uri;

  public ReportServiceImpl() {
    this.webClient = WebClient.builder().baseUrl(this.uri).build();
  }

  @Override
  public Mono<Customer> findCustomerByIdCustomer(String id) {
    return webClient.get().uri(this.uri + "/customer/find/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToMono(Customer.class);
  }

  @Override
  public Flux<CreditCard> findCreditCards() {
    return webClient.get().uri(this.uri + "/creditcard/list")
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(CreditCard.class);
  }

  @Override
  public Flux<Credit> findCreditByIdCreditCard(String id) {
    return webClient.get()
        .uri(this.uri + "/creditCharge/findByIdCreditCard/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Credit.class);
  }

  @Override
  public Flux<CreditTransaction> FindCreditPayByIdCreditCard(String id) {
    return webClient.get()
        .uri(this.uri + "/creditPaid/findByIdCreditCard/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(CreditTransaction.class);
  }

  @Override
  public Flux<CreditCard> findCreditCardByIdCustomer(String id) {
    return webClient.get()
        .uri(this.uri + "/creditcard/findCreditCards/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(CreditCard.class);
  }

  @Override
  public Flux<FixedTerm> findFixeds() {
    return webClient.get().uri(this.uri + "/fixedTerm/list")
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(FixedTerm.class);
  }

  @Override
  public Flux<TransactionFixedTerm> findTransactionFixedByIdFixed(String id) {
    return webClient.get()
        .uri(this.uri + "/transactionFixedTerm/findByFixedId/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(TransactionFixedTerm.class);
  }

  @Override
  public Flux<FixedTerm> findFixedTermByIdCustomer(String id) {
    return webClient.get()
        .uri(this.uri + "/fixedTerm/findAccountByCustomerId/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(FixedTerm.class);
  }

  @Override
  public Flux<CurrentAccount> findCurrents() {
    return webClient.get().uri(this.uri + "/currentAccount/list")
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(CurrentAccount.class);
  }

  @Override
  public Flux<TransactionCurrentAccount> findTransactionCurrentByIdCurrent(
      String id) {
    return webClient.get()
        .uri(
            this.uri + "/transactionCurrentAccount/findByCurrentAccountId/{id}",
            id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(TransactionCurrentAccount.class);
  }

  @Override
  public Flux<CurrentAccount> findCurrentAccountByIdCustomer(String id) {
    return webClient.get()
        .uri(this.uri + "/currentAccount/findAccountByCustomerId/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(CurrentAccount.class);
  }

  @Override
  public Flux<SavingAccount> findSavings() {
    return webClient.get().uri(this.uri + "/savingAccount/list")
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(SavingAccount.class);
  }

  @Override
  public Flux<SavingAccountTransaction> findTransactionSavingsByIdSaving(
      String id) {
    return webClient.get()
        .uri(this.uri + "/transactionSavingAccount/findBySavingAccountId/{id}",
            id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(SavingAccountTransaction.class);
  }

  @Override
  public Flux<SavingAccount> findSavingAccountByIdCustomer(String id) {
    return webClient.get()
        .uri(this.uri + "/savingAccount/findAccountByCustomerId/{id}", id)
        .accept(MediaType.APPLICATION_JSON).retrieve()
        .bodyToFlux(SavingAccount.class);
  }

  @Override
  public boolean isWithInRange(LocalDateTime createAt, LocalDate start,
      LocalDate end) {
    return createAt.toLocalDate().isAfter(start)
        && createAt.toLocalDate().isBefore(end);
  }

}
