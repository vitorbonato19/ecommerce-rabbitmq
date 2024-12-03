package ms_orders.ms.orders.repository;

import ms_orders.ms.orders.entity.embedded.OrderItem;
import ms_orders.ms.orders.entity.embedded.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {


}
