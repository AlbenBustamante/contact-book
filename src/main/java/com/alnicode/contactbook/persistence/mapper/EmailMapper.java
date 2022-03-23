package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Email;
import com.alnicode.contactbook.persistence.entity.EmailEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmailMapper {
    Email toEmail(EmailEntity emailEntity);

    @Mapping(target = "contact", ignore = true)
    EmailEntity toEmailEntity(Email email);
}
