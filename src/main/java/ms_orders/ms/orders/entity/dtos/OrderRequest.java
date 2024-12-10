package ms_orders.ms.orders.entity.dtos;

import ms_orders.ms.orders.entity.enums.Status;

public record OrderRequest(String customerName,
                           String customerPhone,
                           Boolean paid,
                           Status status) {
}
