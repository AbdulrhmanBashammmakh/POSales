package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;
import net.bashammmakh.POSales.Models.Products.Product;
@Entity
public class ItemsBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private Integer Quantity ;
    @Column()
    private double Rate ;
    @Column()
    private double subTotal ;

    @ManyToOne(optional=false)
    @JoinColumn(name="OrderId", nullable=false, updatable=false)
    private Orders order;

    @ManyToOne(optional=false)
    @JoinColumn(name="ProductId", nullable=false, updatable=false)
    private Product product;

/*
	- ProductId
	- OrderId
	- Quantity
	- Rate
	- subTotal
 */
}
