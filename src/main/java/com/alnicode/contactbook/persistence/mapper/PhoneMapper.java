package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Phone;
import com.alnicode.contactbook.persistence.entity.PhoneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PhoneMapper {
    Phone toPhone(PhoneEntity phoneEntity);

    @Mapping(target = "contact", ignore = true)
    PhoneEntity toPhoneEntity(Phone phone);
}
