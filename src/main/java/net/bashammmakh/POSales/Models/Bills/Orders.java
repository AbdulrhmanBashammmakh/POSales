package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @ManyToOne(optional=false)
    @JoinColumn(name="VendorId", nullable=false, updatable=false)
    private Vendor vendor;

    @Column()
    private Integer StateOrder; //1  or 2 or 3

    /*
    - VendorId
	- StateOrder
	- UUID
     */


}
