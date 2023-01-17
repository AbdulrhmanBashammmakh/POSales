package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;
import net.bashammmakh.POSales.Models.Products.Product;
@Entity
public class ItemsBill {
    public ItemsBill(long ID, Integer quantity, double rate, double subTotal, Orders order, Product product) {
        this.ID = ID;
        Quantity = quantity;
        Rate = rate;
        this.subTotal = subTotal;
        this.order = order;
        this.product = product;
    }
    public ItemsBill(Integer quantity, double rate, double subTotal, Orders order, Product product) {

        Quantity = quantity;
        Rate = rate;
        this.subTotal = subTotal;
        this.order = order;
        this.product = product;
    }
    public ItemsBill() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private Integer Quantity =1 ;
    @Column()
    private double Rate =0 ;
    @Column()
    private double subTotal=0 ;

    @ManyToOne(optional=false)
    @JoinColumn(name="OrderId", nullable=false, updatable=false)
    private Orders order;

    @ManyToOne(optional=false)
    @JoinColumn(name="ProductId", nullable=false, updatable=false)
    private Product product;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /*
	- ProductId
	- OrderId
	- Quantity
	- Rate
	- subTotal
 */
}
