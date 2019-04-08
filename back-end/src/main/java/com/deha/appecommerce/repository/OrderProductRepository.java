package com.deha.appecommerce.repository;

import com.deha.appecommerce.model.OrderProduct;
import com.deha.appecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
