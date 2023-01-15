package net.bashammmakh.POSales.DTOs.Stores;

import net.bashammmakh.POSales.DTOs.Products.ProductCostDto;

import java.util.Date;

public class StoreLogDto {
    private long ID ;
    private boolean IsDrift; // true = drift , false = add
    private StoreDto store;
    private ProductCostDto productCost;
    private long ProductId ; // addition information
    private boolean IsDelivered;
    private Date DeliveredDate;
    private Date PostDate;


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

    public StoreDto getStore() {
        return store;
    }

    public void setStore(StoreDto store) {
        this.store = store;
    }

    public ProductCostDto getProductCost() {
        return productCost;
    }

    public void setProductCost(ProductCostDto productCost) {
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
