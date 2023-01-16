package net.bashammmakh.POSales.Models.Products;

import jakarta.persistence.*;

@Entity
public class Category {

    public Category(){

    }

    public Category(long ID, String categoryName) {
        this.ID = ID;
        CategoryName = categoryName;
    }

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;


    @Column()
    private String CategoryName;

    /*

    @JsonIgnore
    private final LocalDateTime editedAt = LocalDateTime.now();

    */


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
