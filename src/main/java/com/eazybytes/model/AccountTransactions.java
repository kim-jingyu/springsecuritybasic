package com.eazybytes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class AccountTransactions {
    @Id
    private String transactionId;

    private long accountNumber;
    private int customerId;
    private Date transactionDt;
    private String transactionSummary;
    private String transactionType;
    private int transactionAmt;
    private int closingBalance;
    private String createAt;
}
