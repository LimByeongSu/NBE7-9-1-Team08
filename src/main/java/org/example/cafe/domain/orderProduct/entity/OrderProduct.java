package org.example.cafe.domain.orderProduct.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cafe.domain.product.entity.Product;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;         //상품번호
    private int orderedQuantity; //상품주문수량
    @ManyToOne
    private Product product;    //상품
  //  @ManyToOne
//    private Order order;      //주문
}
