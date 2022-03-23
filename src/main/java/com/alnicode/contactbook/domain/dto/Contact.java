package com.alnicode.contactbook.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Contact {
    private long contactId;
    private String name;
    private List<Phone> phones;
    private List<Direction> directions;
    private List<Email> emails;
    private List<Event> events;
    private List<ContactsWebsite> websites;
}
