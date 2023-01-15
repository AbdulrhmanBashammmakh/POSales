package net.bashammmakh.POSales.DTOs.Bills;

import net.bashammmakh.POSales.DTOs.Products.ProductDto;

public class ItemsBillDto {

    private long ID ;
    private Integer Quantity ;

    private double Rate ;

    private double subTotal ;

    private OrdersDto order;

    private ProductDto product;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public OrdersDto getOrder() {
        return order;
    }

    public void setOrder(OrdersDto order) {
        this.order = order;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
