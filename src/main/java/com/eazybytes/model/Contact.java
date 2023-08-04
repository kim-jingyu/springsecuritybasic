package com.eazybytes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "contact_messages")
@Getter @Setter
public class Contact {
    @Id
    private String contactId;
    private String contactName;
    private String contactEmail;
    private String subject;
    private String message;
    private Date createDt;
}
