package com.alnicode.contactbook.persistence.repository;

import com.alnicode.contactbook.persistence.entity.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Long> {
    Optional<ContactEntity> findByName(String name);
}
