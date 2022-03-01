package com.nttdata.reports.entity.customer;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.nttdata.reports.entity.enums.EDocumentType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private String id;

  private EDocumentType documentType; // ruc/dni

  private String documentNumber; // ruc o dni

  private String names; // nombres o razon social

  private String gender; // masculino / feminino

  private String numberphone; // telefono

  private String address;

  private TypeCustomer typeCustomer;

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private Date createdAt;
  
}
