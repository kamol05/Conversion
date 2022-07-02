package com.octo.uzb.card.model;

import lombok.*;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "create_time", insertable = false, updatable = false)
//    @Type(type = "timesatamp")
    private Date createtime;

    @Column(name = "provider")
    private String provider;

    @Column(name = "provider_card_id")
    private String providerCardId;

    @Column(name = "masked_pan")
    private String maskedPan;

    @Column(name = "bank_client_id")
    private String bankClientId;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "pan")
    private String pan;

    @Column(name = "bank_id")
    private String bankId;

    @Column(name = "expiry")
    private String expiry;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_id", referencedColumnName = "mfo_code", nullable = false, updatable = false, insertable = false)
    private Bank bank;

}
