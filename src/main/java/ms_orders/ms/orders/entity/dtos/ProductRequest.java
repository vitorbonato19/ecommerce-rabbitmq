package ms_orders.ms.orders.entity.dtos;

import java.math.BigDecimal;

public record ProductRequest(String ean,
                             String description,
                             BigDecimal price,
                             String urlPhoto,
                             String ncm,
                             String cest,
                             String tax) {
}
