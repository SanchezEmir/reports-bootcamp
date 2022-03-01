package com.nttdata.reports.entity.customer;

import com.nttdata.reports.entity.enums.ETypeCustomer;

import lombok.Data;

@Data
public class TypeCustomer {

  private String id;

  private ETypeCustomer value;

  private SubType subType;

}
