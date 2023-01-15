package net.bashammmakh.POSales.DTOs.Products;

public class CategoryDto {

    private long ID ;

    private String CategoryName;

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
