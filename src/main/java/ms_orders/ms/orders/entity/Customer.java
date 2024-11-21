package ms_orders.ms.orders.entity;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private String document;
    private String birthdate;
    private String address;
    private String zipCode;
    private String phoneNumber;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
