package com.alnicode.contactbook.domain.service;

import com.alnicode.contactbook.domain.dto.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAll();
    Contact getById(long contactId);
    Contact getByName(String name);
    Contact save(Contact contact);
    Contact update(long contactId, Contact contact);
    Contact delete(long contactId);
}
