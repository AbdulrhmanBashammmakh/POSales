package net.bashammmakh.POSales.DTOs.Bills;

public class OrdersDto {
    private long ID ;


    private VendorDto vendor;


    private Integer StateOrder;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public VendorDto getVendor() {
        return vendor;
    }

    public void setVendor(VendorDto vendor) {
        this.vendor = vendor;
    }

    public Integer getStateOrder() {
        return StateOrder;
    }

    public void setStateOrder(Integer stateOrder) {
        StateOrder = stateOrder;
    }
}
