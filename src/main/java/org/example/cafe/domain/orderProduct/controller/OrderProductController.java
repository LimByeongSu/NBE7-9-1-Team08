package org.example.cafe.domain.orderProduct.controller;

import lombok.RequiredArgsConstructor;
import org.example.cafe.domain.product.dto.ProductDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderProductController {
    //상품 목록 조회
    @GetMapping("/api/orderProduct")
    @Transactional(readOnly = true)
    public List<ProductDto> getProducts(){

    }
}
