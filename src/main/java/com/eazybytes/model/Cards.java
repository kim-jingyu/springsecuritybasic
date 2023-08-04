package com.eazybytes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
public class Cards {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cardId;

    private int customerId;
    private String cardNumber;
    private String cartType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
    private Date createDt;
}
