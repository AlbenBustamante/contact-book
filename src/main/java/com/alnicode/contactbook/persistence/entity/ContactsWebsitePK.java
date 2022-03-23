package com.alnicode.contactbook.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ContactsWebsitePK implements Serializable {
    @Column(name = "contact_id")
    private Long contactId;

    @Column(name = "website_id")
    private Long websiteId;
}
