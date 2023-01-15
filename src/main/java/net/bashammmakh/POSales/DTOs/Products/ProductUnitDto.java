package net.bashammmakh.POSales.DTOs.Products;

public class ProductUnitDto {

    private long ID ;

    private Integer AvaQuantity;

    private double SellingPrice;

    private String BarCode;

    private String QrCode;

    private ProductDto product;

    private UnitNameDto unitName;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getAvaQuantity() {
        return AvaQuantity;
    }

    public void setAvaQuantity(Integer avaQuantity) {
        AvaQuantity = avaQuantity;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getQrCode() {
        return QrCode;
    }

    public void setQrCode(String qrCode) {
        QrCode = qrCode;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public UnitNameDto getUnitName() {
        return unitName;
    }

    public void setUnitName(UnitNameDto unitName) {
        this.unitName = unitName;
    }
}
