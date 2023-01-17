package net.bashammmakh.POSales.Models.Bills;

import jakarta.persistence.*;

@Entity
public class Vendor {

    public Vendor(long ID, String name, String companyName, String phone, String address) {
        this.ID = ID;
        Name = name;
        CompanyName = companyName;
        Phone = phone;
        Address = address;
    }
    public Vendor( String name, String companyName, String phone, String address) {

        Name = name;
        CompanyName = companyName;
        Phone = phone;
        Address = address;
    }
    public Vendor() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private String Name;
    @Column()
    private String CompanyName;
    @Column()
    private String Phone;
    @Column()
    private String Address;
    /*
    - Name
	- CompanyName
	- Phone
	- Address
     */

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

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
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
