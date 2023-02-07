package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;
import net.bashammmakh.POSales.Models.Products.Product;
@Entity
public class ItemsBill {
    public ItemsBill(long ID, Integer quantity, double rate, double subTotal,  Product product) {
        this.ID = ID;
        Quantity = quantity;
        Rate = rate;
        this.subTotal = subTotal;

        this.product = product;
    }
    public ItemsBill(Integer quantity, double rate,  Product product) {

        Quantity = quantity;
        Rate = rate;
        this.subTotal = quantity * rate;

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
    private double subTotal;
            //= Quantity * Rate;

   /*
    @ManyToOne(optional=false)
    @JoinColumn(name="OrderId")
    private Orders orders;
*/

    @ManyToOne(optional=false)
    @JoinColumn(name="ProductId")
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

    public void setSubTotal(double Ta) {
        this.subTotal = Ta;
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
