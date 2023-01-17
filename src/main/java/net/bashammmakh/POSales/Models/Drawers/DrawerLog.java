package net.bashammmakh.POSales.Models.Drawers;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DrawerLog {

    public DrawerLog(long ID, Drawer drawer, boolean isWithdrw, double amount, Date postDate) {
        this.ID = ID;
        this.drawer = drawer;
        IsWithdrw = isWithdrw;
        Amount = amount;
        this.postDate = postDate;
    }
    public DrawerLog( Drawer drawer, boolean isWithdrw, double amount, Date postDate) {

        this.drawer = drawer;
        IsWithdrw = isWithdrw;
        Amount = amount;
        this.postDate = postDate;
    }
    public DrawerLog() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;


    @ManyToOne(optional=false)
    @JoinColumn(name="DrawerId", nullable=false, updatable=false)
    private Drawer drawer;

    @Column()
    private boolean IsWithdrw;
    @Column()
    private double Amount;
    @Column()
    private Date postDate;
    /*
    - TypeTrans
	- Amount
	- Date
     */

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    public boolean isWithdrw() {
        return IsWithdrw;
    }

    public void setWithdrw(boolean withdrw) {
        IsWithdrw = withdrw;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
