package com.alnicode.contactbook.web.controller;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.domain.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping
    public ResponseEntity<List<Contact>> getAll() {
        return new ResponseEntity<>(this.service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable("id") long contactId) {
        return ResponseEntity.of(this.service.getContact(contactId));
    }

    @GetMapping("/{name}")
    public ResponseEntity<Contact> getByName(@PathVariable("name") String name) {
        return ResponseEntity.of(this.service.getByName(name));
    }

    @PostMapping
    public ResponseEntity<Contact> save(@RequestBody Contact contact) {
        return new ResponseEntity<>(this.service.save(contact), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> update(@PathVariable("id") long contactId, @RequestBody Contact contact) {
        return new ResponseEntity<>(this.service.update(contactId, contact), HttpStatus.OK);
    }
}
