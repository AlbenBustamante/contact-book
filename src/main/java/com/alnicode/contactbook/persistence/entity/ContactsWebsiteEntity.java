package com.alnicode.contactbook.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "contacts_websites")
public class ContactsWebsiteEntity {
    @EmbeddedId
    private ContactsWebsitePK id;

    private String role;

    @ManyToOne
    @MapsId("contactId")
    @JoinColumn(name = "contact_id", insertable = false, updatable = false)
    private ContactEntity contact;

    @ManyToOne
    @JoinColumn(name = "website_id", insertable = false, updatable = false)
    private WebsiteEntity website;
}
