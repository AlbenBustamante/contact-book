package com.alnicode.contactbook.persistence.mapper;

import com.alnicode.contactbook.domain.dto.Website;
import com.alnicode.contactbook.persistence.entity.WebsiteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WebsiteMapper {
    Website toWebsite(WebsiteEntity websiteEntity);

    WebsiteEntity toWebsiteEntity(Website website);
}
