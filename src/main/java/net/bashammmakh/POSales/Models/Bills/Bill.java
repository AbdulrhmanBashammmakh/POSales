package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Bill {
    public Bill(long ID, double total, double discount, double paid, Integer billType, Date billDate, Orders order) {
        this.ID = ID;
        Total = total;
        Discount = discount;
        Net = culNet();
        Paid = paid;
        BillType = billType;
        BillDate = billDate;
        this.order = order;
    }
    public Bill( double total, double discount, double paid, Integer billType, Date billDate, Orders order) {
        Total = total;
        Discount = discount;
         Net = culNet();
        Paid = paid;
        BillType = billType;
        BillDate = billDate;
        this.order = order;
    }
    public Bill() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private double Total =0.0 ;
    @Column()
    private double Discount =0.0;
    @Column()
    private double Net =0.0 ;
    @Column()
    private double Paid =0.0;
    @Column()
    private Integer BillType = 1;
    @Column()
    private Date BillDate ;

    @ManyToOne(optional=false)
    @JoinColumn(name="OrderId", nullable=false, updatable=false)
    private Orders order;

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

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    private  double culNet(){

        return this.Total - this.Discount;
    }

    /*

    - OrderId
	- Total
	- Discount
	- Net
	- Paid
	- BillType
	- BillDate
     */
}
