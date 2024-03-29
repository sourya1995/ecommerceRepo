package com.sourya.ecommerce.repository;

import com.sourya.ecommerce.entity.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}
