package ms_orders.ms.orders.entity.dtos;

import ms_orders.ms.orders.entity.Order;

import java.util.List;

public record CustomerResponse(Long id,
                               String name,
                               String document,
                               String birthdate,
                               String address,
                               String zipCode,
                               String phoneNumber,
                               List<Order> orders) {
}
