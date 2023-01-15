package net.bashammmakh.POSales.DTOs.Products;

import java.util.Date;

public class ProductCostDto {

    private long ID ;

    private double CostPrice;
    private Integer AvaQtyNow;

    private boolean IsDateExpire;

    private Date DateExpire;

    private ProductDto product;

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

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
