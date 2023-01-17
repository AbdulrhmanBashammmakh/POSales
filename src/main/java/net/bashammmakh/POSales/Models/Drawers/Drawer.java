package net.bashammmakh.POSales.Models.Drawers;

import jakarta.persistence.*;

@Entity
public class Drawer {


    public Drawer(long ID, double amountCash, String codeNumber, boolean isAvailable) {
        this.ID = ID;
        AmountCash = amountCash;
        this.codeNumber = codeNumber;
        IsAvailable = isAvailable;
    }
    public Drawer( double amountCash, String codeNumber, boolean isAvailable) {

        AmountCash = amountCash;
        this.codeNumber = codeNumber;
        IsAvailable = isAvailable;
    }
    public Drawer() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private double AmountCash;
    @Column()
    private String codeNumber;
    @Column()
    private boolean IsAvailable;


/*
	- codeNumber
	- AmountCash
	- IsAvailable

 */

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getAmountCash() {
        return AmountCash;
    }

    public void setAmountCash(double amountCash) {
        AmountCash = amountCash;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public boolean isAvailable() {
        return IsAvailable;
    }

    public void setAvailable(boolean available) {
        IsAvailable = available;
    }
}
