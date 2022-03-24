package com.alnicode.contactbook.domain.service.impl;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.domain.service.ContactService;
import com.alnicode.contactbook.persistence.entity.ContactEntity;
import com.alnicode.contactbook.persistence.mapper.ContactMapper;
import com.alnicode.contactbook.persistence.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    private static final String CONTACT_NOT_FOUND_MESSAGE = "Contact not found!";

    @Autowired
    private ContactRepository repository;

    @Autowired
    private ContactMapper mapper;


    @Override
    public List<Contact> getAll() {
        List<ContactEntity> contacts = (List<ContactEntity>) this.repository.findAll();
        return this.mapper.toContacts(contacts);
    }

    @Override
    public Optional<Contact> getContact(long contactId) {
        return this.repository.findById(contactId).map(contact -> this.mapper.toContact(contact));
    }

    @Override
    public Optional<Contact> getByName(String name) {
        return this.repository.findByName(name).map(contact -> this.mapper.toContact(contact));
    }

    @Override
    public Contact save(Contact contact) {
        ContactEntity contactEntity = this.mapper.toContactEntity(contact);
        contactEntity.getWebsites().forEach(website -> website.setContact(contactEntity));
        return this.mapper.toContact(contactEntity);
    }

    @Override
    public Contact update(long contactId, Contact contact) {
        return this.getContact(contactId).map(newContact -> {
            newContact.setContactId(contactId);
            newContact.setDirections(contact.getDirections());
            newContact.setEmails(contact.getEmails());
            newContact.setPhones(contact.getPhones());
            newContact.setEvents(contact.getEvents());
            newContact.setWebsites(contact.getWebsites());
            newContact.setName(contact.getName());

            ContactEntity newEntity = this.mapper.toContactEntity(newContact);
            return this.mapper.toContact(this.repository.save(newEntity));
        }).orElseThrow(() -> new RuntimeException(CONTACT_NOT_FOUND_MESSAGE));
    }

    @Override
    public Contact delete(long contactId) {
        return null;
    }
}
