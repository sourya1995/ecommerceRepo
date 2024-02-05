package com.sourya.ecommerce.repository;

import com.sourya.api.model.NewOrder;
import com.sourya.ecommerce.entity.OrderEntity;

import java.util.Optional;

public interface OrderRepositoryExt {
    Optional<OrderEntity> insert(NewOrder m);
}
