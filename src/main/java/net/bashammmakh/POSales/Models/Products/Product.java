package net.bashammmakh.POSales.Models.Products;

import jakarta.persistence.*;

@Entity
public class Product {

    public Product(long ID, String name, String code, String description, Category category) {
        this.ID = ID;
        Name = name;
        Code = code;
        Description = description;
        this.category = category;
    }
    public Product( String name, String code, String description, Category category) {

        Name = name;
        Code = code;
        Description = description;
        this.category = category;
    }
    public Product() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private String Name;

    @Column()
    private String Code;

    @Column()
    private String Description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CategoryId", nullable=false, updatable=false)
    private Category category;

/*
	- CategoryId
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

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
