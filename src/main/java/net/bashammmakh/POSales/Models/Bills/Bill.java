package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private double Total ;
    @Column()
    private double Discount ;
    @Column()
    private double Net ;
    @Column()
    private double Paid ;
    @Column()
    private Integer BillType ;
    @Column()
    private Date BillDate ;

    @ManyToOne(optional=false)
    @JoinColumn(name="OrderId", nullable=false, updatable=false)
    private Orders order;

    /*

    - OrderId
	- Total
	- Discount
	- Net
	- Paid
	- BillType
	- BillDate
     */
}
