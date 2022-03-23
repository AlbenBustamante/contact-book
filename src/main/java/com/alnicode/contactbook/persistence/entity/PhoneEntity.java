package com.alnicode.contactbook.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "phones")
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private Long phoneId;

    @Column(length = 30, nullable = false, unique = true)
    private String number;

    private String type;

    @Column(name = "contact_id")
    private Long contactId;

    @ManyToOne
    @JoinColumn(name = "contact_id", insertable = false, updatable = false)
    private ContactEntity contact;
}
