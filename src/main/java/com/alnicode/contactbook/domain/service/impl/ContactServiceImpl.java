package com.alnicode.contactbook.domain.service.impl;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.domain.service.ContactService;
import com.alnicode.contactbook.persistence.mapper.ContactMapper;
import com.alnicode.contactbook.persistence.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Contact getById(long contactId) {
        return null;
    }

    @Override
    public Contact getByName(String name) {
        return null;
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
