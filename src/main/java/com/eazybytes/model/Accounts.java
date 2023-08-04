package com.eazybytes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Accounts {
    @Id
    private long accountNumber;

    private int customerId;
    private String accountType;
    private String branchAddress;
    private String createDt;
}
