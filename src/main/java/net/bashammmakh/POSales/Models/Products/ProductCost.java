package net.bashammmakh.POSales.Models.Products;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProductCost {

    public ProductCost(long ID, double costPrice, Integer avaQtyNow, boolean isDateExpire, Date dateExpire, Product product) {
        this.ID = ID;
        CostPrice = costPrice;
        AvaQtyNow = avaQtyNow;
        IsDateExpire = isDateExpire;
        DateExpire = dateExpire;
        this.product = product;

    }

    public ProductCost( double costPrice, Integer avaQtyNow, boolean isDateExpire, Date dateExpire, Product product) {
        this.ID = ID;
        CostPrice = costPrice;
        AvaQtyNow = avaQtyNow;
        IsDateExpire = isDateExpire;
        DateExpire = dateExpire;
        this.product = product;

    }
    public ProductCost( ) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private double CostPrice;
    @Column()
    private Integer AvaQtyNow;

    @Column()
    private boolean IsDateExpire;
    @Column()
    private Date DateExpire;



    @ManyToOne(optional=false)
    @JoinColumn(name="ProductId", nullable=false, updatable=false)
    private Product product;
/*
    - ProductId

	- VendorId
	- CostPrice
	- Quantity
	- VendorCode
	- IsDateExpire
	- DateExpire
 */





public long getID() {
    return ID;
}

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(double costPrice) {
        CostPrice = costPrice;
    }

    public Integer getAvaQtyNow() {
        return AvaQtyNow;
    }

    public void setAvaQtyNow(Integer avaQtyNow) {
        AvaQtyNow = avaQtyNow;
    }

    public boolean isDateExpire() {
        return IsDateExpire;
    }

    public void setDateExpire(boolean dateExpire) {
        IsDateExpire = dateExpire;
    }

    public Date getDateExpire() {
        return DateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        DateExpire = dateExpire;
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
