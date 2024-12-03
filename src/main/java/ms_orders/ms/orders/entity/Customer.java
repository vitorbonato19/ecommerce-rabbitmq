package ms_orders.ms.orders.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR (100) DEFAULT NULL")
    private String name;
    @Column(columnDefinition = "VARCHAR (25) UNIQUE DEFAULT NULL")
    private String document;
    @Column(columnDefinition = "DATE DEFAULT '1000-01-01'")
    private String birthdate;
    @Column(columnDefinition = "VARCHAR (100) DEFAULT NULL")
    private String address;
    @Column(columnDefinition = "VARCHAR (100) DEFAULT NULL")
    private String zipCode;
    @Column(columnDefinition = "VARCHAR (20) UNIQUE DEFAULT NULL")
    private String phoneNumber;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer() {

    }

    public Customer(Long id, String name, String document, String birthdate, String address, String zipCode, String phoneNumber, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.birthdate = birthdate;
        this.address = address;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) && document.equals(customer.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, document);
    }
}
