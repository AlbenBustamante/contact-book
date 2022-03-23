package com.alnicode.contactbook.domain.service.impl;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.domain.service.ContactService;
import com.alnicode.contactbook.persistence.mapper.ContactMapper;
import com.alnicode.contactbook.persistence.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Autowired
    private ContactMapper mapper;


    @Override
    public List<Contact> getAll() {
        return null;
    }

    @Override
    public Optional<Contact> getContact(long contactId) {
        return Optional.empty();
    }

    @Override
    public Optional<Contact> getByName(String name) {
        return Optional.empty();
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public Contact update(long contactId, Contact contact) {
        return null;
    }

    @Override
    public Contact delete(long contactId) {
        return null;
    }
}
