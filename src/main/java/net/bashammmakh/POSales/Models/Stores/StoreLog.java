package net.bashammmakh.POSales.Models.Stores;

import jakarta.persistence.*;
import net.bashammmakh.POSales.Models.Products.ProductCost;

import java.util.Date;
@Entity
public class StoreLog {


    public StoreLog(long ID, boolean isDrift, Store store, ProductCost productCost, long productId, boolean isDelivered, Date deliveredDate) {
        this.ID = ID;
        IsDrift = isDrift;
        this.store = store;
        this.productCost = productCost;
        ProductId = productId;
        IsDelivered = isDelivered;
        DeliveredDate = deliveredDate;

    }
    public StoreLog( boolean isDrift, Store store, ProductCost productCost, long productId, boolean isDelivered, Date deliveredDate) {

        IsDrift = isDrift;
        this.store = store;
        this.productCost = productCost;
        ProductId = productId;
        IsDelivered = isDelivered;
        DeliveredDate = deliveredDate;

    }
    public StoreLog() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private boolean IsDrift = false; // true = drift , false = add

    @ManyToOne(optional=false)
    @JoinColumn(name="StoreId", nullable=false, updatable=false)
    private Store store;

    @ManyToOne(optional=false)
    @JoinColumn(name="ProductCostId", nullable=false, updatable=false)
    private ProductCost productCost;

    @Column()
    private long ProductId ; // addition information


    @Column()
    private boolean IsDelivered=true;
    @Column()
    private Date DeliveredDate;
    @Column()
    private Date PostDate = new Date();


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
