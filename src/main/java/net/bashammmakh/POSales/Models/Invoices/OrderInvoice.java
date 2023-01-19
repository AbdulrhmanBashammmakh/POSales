package net.bashammmakh.POSales.Models.Invoices;

import jakarta.persistence.*;
@Entity
public class OrderInvoice {

    public OrderInvoice(long ID, Customer customer, Integer stateOrder) {
        this.ID = ID;
        this.customer = customer;
        StateOrder = stateOrder;
    }
    public OrderInvoice( Customer customer, Integer stateOrder) {
        this.customer = customer;
        StateOrder = stateOrder;
    }
    public OrderInvoice() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @ManyToOne(optional=false)
    @JoinColumn(name="CustomerId", nullable=false, updatable=false)
    private Customer customer;

    @Column()
    private Integer StateOrder =1; //1  pending  or 2 rejected or 3 completed

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getStateOrder() {
        return StateOrder;
    }

    public void setStateOrder(Integer stateOrder) {
        StateOrder = stateOrder;
    }
}
