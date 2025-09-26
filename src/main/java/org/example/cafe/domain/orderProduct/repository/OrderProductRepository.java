package org.example.cafe.domain.orderProduct.repository;

import org.example.cafe.domain.orderProduct.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {

}
