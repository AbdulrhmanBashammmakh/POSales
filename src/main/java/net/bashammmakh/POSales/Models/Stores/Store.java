package net.bashammmakh.POSales.Models.Stores;

import jakarta.persistence.*;

@Entity
public class Store {
    public Store(long ID, String storeName) {
        this.ID = ID;
        StoreName = storeName;
    }
    public Store( String storeName) {

        StoreName = storeName;
    }
    public Store() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;


    @Column()
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
