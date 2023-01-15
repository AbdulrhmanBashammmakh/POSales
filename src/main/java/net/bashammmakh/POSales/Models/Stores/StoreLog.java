package net.bashammmakh.POSales.Models.Stores;

import jakarta.persistence.*;
import net.bashammmakh.POSales.Models.Products.ProductCost;

import java.util.Date;
@Entity
public class StoreLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private boolean IsDrift; // true = drift , false = add

    @ManyToOne(optional=false)
    @JoinColumn(name="StoreId", nullable=false, updatable=false)
    private Store store;

    @ManyToOne(optional=false)
    @JoinColumn(name="ProductCostId", nullable=false, updatable=false)
    private ProductCost productCost;

    @Column()
    private long ProductId ; // addition information


    @Column()
    private boolean IsDelivered;
    @Column()
    private Date DeliveredDate;
    @Column()
    private Date PostDate;


    /*
    - AddOrDrfit
	- TypeAction
	- StoreId
	- ProductCostId = product_cost
	- Qty
	- PostDate
	- IsDelivered
	- DeliveredDate
     */
}
