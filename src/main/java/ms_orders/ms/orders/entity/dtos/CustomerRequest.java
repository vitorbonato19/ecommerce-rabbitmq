package ms_orders.ms.orders.entity.dtos;

import ms_orders.ms.orders.entity.Order;

import java.util.List;

public record CustomerRequest(String name,
                              String document,
                              String birthdate,
                              String address,
                              String zipCode,
                              String phoneNumber) {
}
