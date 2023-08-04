package com.eazybytes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "notice_details")
@Getter @Setter
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noticeId;

    private String noticeSummary;
    private String noticeDetails;
    private Date noticBegDt;
    private Date noticEndDt;
    private Date createDt;
    private Date updateDt;
}
