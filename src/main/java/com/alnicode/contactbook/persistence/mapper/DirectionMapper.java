package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Direction;
import com.alnicode.contactbook.persistence.entity.DirectionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DirectionMapper {
    Direction toDirection(DirectionEntity directionEntity);

    @Mapping(target = "contact", ignore = true)
    DirectionEntity toDirectionEntity(Direction direction);
}
