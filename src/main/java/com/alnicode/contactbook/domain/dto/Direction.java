package com.alnicode.contactbook.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Direction {
    private long directionId;
    private String name;
    private String type;
    private long contactId;
}
