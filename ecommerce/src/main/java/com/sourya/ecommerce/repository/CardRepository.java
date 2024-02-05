package com.sourya.ecommerce.repository;

import com.sourya.ecommerce.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}
