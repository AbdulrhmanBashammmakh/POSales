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

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public boolean isDrift() {
        return IsDrift;
    }

    public void setDrift(boolean drift) {
        IsDrift = drift;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public ProductCost getProductCost() {
        return productCost;
    }

    public void setProductCost(ProductCost productCost) {
        this.productCost = productCost;
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public boolean isDelivered() {
        return IsDelivered;
    }

    public void setDelivered(boolean delivered) {
        IsDelivered = delivered;
    }

    public Date getDeliveredDate() {
        return DeliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        DeliveredDate = deliveredDate;
    }

    public Date getPostDate() {
        return PostDate;
    }

    public void setPostDate(Date postDate) {
        PostDate = postDate;
    }
}
