package com.alnicode.contactbook.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
    private long phoneId;
    private String number;
    private String type;
    private long contactId;
}
