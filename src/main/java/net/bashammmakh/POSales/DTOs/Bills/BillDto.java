package net.bashammmakh.POSales.DTOs.Bills;

import java.util.Date;

public class BillDto {
    private long ID ;

    private double Total ;

    private double Discount ;

    private double Net ;

    private double Paid ;

    private Integer BillType ;

    private Date BillDate ;

    private OrdersDto order;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    public double getNet() {
        return Net;
    }

    public void setNet(double net) {
        Net = net;
    }

    public double getPaid() {
        return Paid;
    }

    public void setPaid(double paid) {
        Paid = paid;
    }

    public Integer getBillType() {
        return BillType;
    }

    public void setBillType(Integer billType) {
        BillType = billType;
    }

    public Date getBillDate() {
        return BillDate;
    }

    public void setBillDate(Date billDate) {
        BillDate = billDate;
    }

    public OrdersDto getOrder() {
        return order;
    }

    public void setOrder(OrdersDto order) {
        this.order = order;
    }
}
