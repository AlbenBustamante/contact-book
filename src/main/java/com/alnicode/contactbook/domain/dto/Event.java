package com.alnicode.contactbook.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Event {
    private long eventId;
    private LocalDate date;
    private String type;
    private long contactId;
}
