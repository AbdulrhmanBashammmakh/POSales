package net.bashammmakh.POSales.Models.Products;

import jakarta.persistence.*;

@Entity
public class UnitName {
    public UnitName(long ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public UnitName(String name) {
        Name = name;
    }
    public UnitName() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private String Name;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
