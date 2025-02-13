package tech.study.cml.orderms.controller.dto;

import tech.study.cml.orderms.entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity orderEntity) {
        return new OrderResponse(orderEntity.getOrderId(), orderEntity.getCustomerId(), orderEntity.getTotal());
    }
}
