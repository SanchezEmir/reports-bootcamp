package com.nttdata.reports.entity.current;

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
public class ReportCurrentAccount {

  private ConsultationPerProduct data;

  private List<CurrentList> result;

}
