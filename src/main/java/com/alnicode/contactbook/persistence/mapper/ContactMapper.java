package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Contact;
import com.alnicode.contactbook.persistence.entity.ContactEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        DirectionMapper.class, EmailMapper.class, EventMapper.class,
        PhoneMapper.class, ContactsWebsiteMapper.class})
public interface ContactMapper {
    Contact toContact(ContactEntity contactEntity);

    ContactEntity toContactEntity(Contact contact);
}
