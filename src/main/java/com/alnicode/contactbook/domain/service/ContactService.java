package com.alnicode.contactbook.domain.service;

import com.alnicode.contactbook.domain.dto.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<Contact> getAll();
    Optional<Contact> getContact(long contactId);
    Optional<Contact> getByName(String name);
    Contact save(Contact contact);
    Contact update(long contactId, Contact contact);
    boolean delete(long contactId);
}
