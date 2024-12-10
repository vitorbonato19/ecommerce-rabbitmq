package ms_orders.ms.orders.entity.dtos;

import ms_orders.ms.orders.entity.Customer;
import ms_orders.ms.orders.entity.embedded.OrderItem;
import ms_orders.ms.orders.entity.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(Long id,
                            String customerName,
                            String customerPhone,
                            Integer totalItens,
                            Integer published,
                            Boolean paid,
                            Status status,
                            LocalDateTime createdAt,
                            LocalDateTime lastModified,
                            LocalDateTime timePublished,
                            Customer customer,
                            List<OrderItem> orderItems) {
}
