package com.nttdata.reports.entity.credit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

import com.nttdata.reports.entity.ConsultationPerProduct;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ReportCreditCard {

  private ConsultationPerProduct data;

  private List<CreditCardList> result;

}
