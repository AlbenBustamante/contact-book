package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Event;
import com.alnicode.contactbook.persistence.entity.EventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEvent(EventEntity eventEntity);

    @Mapping(target = "contact", ignore = true)
    EventEntity toEventEntity(Event event);
}
