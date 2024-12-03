package ms_orders.ms.orders.entity;

import jakarta.persistence.*;
import ms_orders.ms.orders.entity.embedded.OrderItem;
import ms_orders.ms.orders.entity.enums.Status;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "customerName", columnDefinition = "VARCHAR(75) DEFAULT NULL")
    private String customerName;
    @NotBlank
    @Column(name = "customePhone", columnDefinition = "VARCHAR(25) DEFAULT NULL")
    private String customerPhone;
    @NotBlank
    @Column(name = "itensTotal", columnDefinition = "INT(20) NOT NULL")
    private Integer totalItens;
    @Column(columnDefinition = "INT(10) DEFAULT 0")
    private Boolean published;
    @Column(columnDefinition = "INT(10) DEFAULT 0")
    private Boolean paid;
    @NotBlank
    @Column(columnDefinition = "VARCHAR(25) DEFAULT 'PEDING'")
    private Status status;
    @Column(columnDefinition = "TIMESTAMP DEFAULT '2000-01-01 00:00:00'")
    private LocalDateTime createdAt;
    @Column(columnDefinition = "TIMESTAMP DEFAULT '2000-01-01 00:00:00'")
    private LocalDateTime lastModified;
    @Column(columnDefinition = "TIMESTAMP DEFAULT '2000-01-01 00:00:00'")
    private LocalDateTime timePublished;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    public Order() {

    }

    public Order(Long id, String customerName, String customerPhone, Integer totalItens, Boolean published, Boolean paid, Status status, LocalDateTime createdAt, LocalDateTime lastModified, LocalDateTime timePublished, Customer customer) {
        this.id = id;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.totalItens = totalItens;
        this.published = published;
        this.paid = paid;
        this.status = status;
        this.createdAt = createdAt;
        this.lastModified = lastModified;
        this.timePublished = timePublished;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(Integer totalItens) {
        this.totalItens = totalItens;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDateTime getTimePublished() {
        return timePublished;
    }

    public void setTimePublished(LocalDateTime timePublished) {
        this.timePublished = timePublished;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
