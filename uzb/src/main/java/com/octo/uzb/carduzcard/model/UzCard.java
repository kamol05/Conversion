package com.octo.uzb.carduzcard.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "card_uzcard")
public class UzCard {
    @Id
    @GeneratedValue
    private String id;

    private String username;

    private String pan;

    private String expiry;

    private String status;

    private String phone;

    private String fullName;

    private String balance;
}
