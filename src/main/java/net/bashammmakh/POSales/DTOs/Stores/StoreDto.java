package net.bashammmakh.POSales.DTOs.Stores;

public class StoreDto {
    private long ID ;
    private String StoreName;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }
}
