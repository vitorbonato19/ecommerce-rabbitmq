package ms_orders.ms.orders.entity.embedded;

import jakarta.persistence.*;
import ms_orders.ms.orders.entity.Order;
import ms_orders.ms.orders.entity.Product;

@Entity
@Table(name = "orderitem")
public class OrderItem {

    @EmbeddedId
    private OrderItemId id;

    private Integer quantity;
    private Double price;

    @MapsId("orderId")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @MapsId("productId")
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItem() {

    }

    public OrderItem(OrderItemId id, Integer quantity, Double price, Order order, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.order = order;
        this.product = product;
    }

    public OrderItemId getId() {
        return id;
    }

    public void setId(OrderItemId id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
