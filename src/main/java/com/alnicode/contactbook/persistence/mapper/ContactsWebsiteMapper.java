package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.ContactsWebsite;
import com.alnicode.contactbook.persistence.entity.ContactsWebsiteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContactsWebsiteMapper {
    @Mapping(target = "websiteId", source = "id.websiteId")
    ContactsWebsite toContactsWebsite(ContactsWebsiteEntity contactsWebsiteEntity);

    @InheritInverseConfiguration
    @Mapping(target = "website", ignore = true)
    @Mapping(target = "contact", ignore = true)
    @Mapping(target = "id.contactId", ignore = true)
    ContactsWebsiteEntity toContactsWebsiteEntity(ContactsWebsite contactsWebsite);
}
