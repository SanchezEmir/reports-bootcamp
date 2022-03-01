package com.nttdata.reports.entity.fixedterm;

import java.util.List;

import com.nttdata.reports.entity.ConsultationPerProduct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ReportFixedAccount {

  private ConsultationPerProduct data;

  private List<FixedList> result;

}
