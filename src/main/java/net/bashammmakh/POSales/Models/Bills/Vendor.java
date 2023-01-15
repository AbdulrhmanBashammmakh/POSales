package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private String Name;
    @Column()
    private String CompanyName;
    @Column()
    private String Phone;
    @Column()
    private String Address;
    /*
    - Name
	- CompanyName
	- Phone
	- Address
     */
}
