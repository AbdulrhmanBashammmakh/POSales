package net.bashammmakh.POSales.Models.Invoices;

import jakarta.persistence.*;

@Entity
public class Customer {

    public Customer(long ID, String name, String phone, String address) {
        this.ID = ID;
        Name = name;
        Phone = phone;
        Address = address;
    }
    public Customer( String name, String phone, String address) {

        Name = name;
        Phone = phone;
        Address = address;
    }

    public Customer() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private String Name;
    @Column()
    private String Phone;
    @Column()
    private String Address;


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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
