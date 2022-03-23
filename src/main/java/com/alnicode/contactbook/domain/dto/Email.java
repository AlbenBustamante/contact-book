package com.alnicode.contactbook.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email {
    private long emailId;
    private String direction;
    private String type;
    private long contactId;
}
