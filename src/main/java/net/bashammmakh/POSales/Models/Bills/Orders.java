package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

@Entity
public class Orders {
    public Orders(long ID, Vendor vendor, Integer stateOrder) {
        this.ID = ID;
        this.vendor = vendor;
        StateOrder = stateOrder;
    }
    public Orders( Vendor vendor, Integer stateOrder) {

        this.vendor = vendor;
        StateOrder = stateOrder;
    }
    public Orders() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @ManyToOne(optional=false)
    @JoinColumn(name="VendorId", nullable=false, updatable=false)
    private Vendor vendor;

    @Column()
    private Integer StateOrder =1; //1  or 2 or 3

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Integer getStateOrder() {
        return StateOrder;
    }

    public void setStateOrder(Integer stateOrder) {
        StateOrder = stateOrder;
    }

    /*
    - VendorId
	- StateOrder
	- UUID
     */


}
