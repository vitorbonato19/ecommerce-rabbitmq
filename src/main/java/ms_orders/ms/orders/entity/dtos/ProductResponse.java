package ms_orders.ms.orders.entity.dtos;

import java.math.BigDecimal;

public record ProductResponse(Long id,
                              String ean,
                              String description,
                              BigDecimal price,
                              Integer stock,
                              String urlPhoto,
                              String ncm,
                              String cest,
                              String tax) {
}
