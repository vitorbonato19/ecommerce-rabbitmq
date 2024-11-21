package ms_orders.ms.orders.entity;

import jakarta.persistence.ManyToMany;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class Product {

    private Long id;
    private String ean;
    private String description;
    private BigDecimal price;
    private Long stock;
    private String urlPhoto;
    private String ncm;
    private String cest;
    private String tax;
    @ManyToMany
    private List<Order> orders;

}
