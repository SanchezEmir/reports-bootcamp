package com.nttdata.reports.entity.saving;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingList {

  private SavingAccount saving;

  private List<SavingAccountTransaction> transactions;

}
