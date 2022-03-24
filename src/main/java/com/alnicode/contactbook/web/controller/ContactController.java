package com.alnicode.contactbook.web.controller;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.domain.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    public ResponseEntity<List<Contact>> getAll() {
        return new ResponseEntity<>(this.service.getAll(), HttpStatus.OK);
    }
}
