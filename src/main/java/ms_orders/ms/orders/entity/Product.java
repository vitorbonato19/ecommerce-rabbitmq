package ms_orders.ms.orders.entity;

import jakarta.persistence.*;
import ms_orders.ms.orders.entity.embedded.OrderItem;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR (50) DEFAULT NULL UNIQUE")
    @NotBlank
    private String ean;
    @Column(columnDefinition = "VARCHAR (100) DEFAULT NULL")
    @NotBlank
    private String description;
    @Column(columnDefinition = "INT (10) DEFAULT 0 NOT NULL")
    private BigDecimal price;
    @Column(columnDefinition = "DECIMAL(10, 2) DEFAULT 0.00 NOT NULL")
    private Long stock;
    @Column(columnDefinition = "VARCHAR (100) DEFAULT 'https://no-photo'")
    private String urlPhoto;
    @Column(columnDefinition = "VARCHAR (7) DEFAULT 779800 NOT NULL")
    private String ncm;
    @Column(columnDefinition = "VARCHAR (4) DEFAULT 7790 NOT NULL")
    private String cest;
    @Column(columnDefinition = "CHAR (1) DEFAULT 'T' NOT NULL")
    private String tax;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    public Product() {

    }

    public Product(Long id, String ean, String description, BigDecimal price, Long stock, String urlPhoto, String ncm, String cest, String tax, List<OrderItem> orderItems) {
        this.id = id;
        this.ean = ean;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.urlPhoto = urlPhoto;
        this.ncm = ncm;
        this.cest = cest;
        this.tax = tax;
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(ean, product.ean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ean);
    }
}
