package com.nttdata.reports.entity.fixedterm;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FixedList {

  private FixedTerm fixed;

  private List<TransactionFixedTerm> transactions;

}
