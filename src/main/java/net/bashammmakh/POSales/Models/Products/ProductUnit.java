package net.bashammmakh.POSales.Models.Products;

import jakarta.persistence.*;

@Entity
public class ProductUnit {

    public ProductUnit(long ID, Integer avaQuantity, double sellingPrice, String barCode, String qrCode, Product product, UnitName unitName) {
        this.ID = ID;
        AvaQuantity = avaQuantity;
        SellingPrice = sellingPrice;
        BarCode = barCode;
        QrCode = qrCode;
        this.product = product;
        this.unitName = unitName;
    }
    public ProductUnit(double sellingPrice,Integer avaQuantity,  String barCode, String qrCode, Product product, UnitName unitName) {

        AvaQuantity = avaQuantity;
        SellingPrice = sellingPrice;
        BarCode = barCode;
        QrCode = qrCode;
        this.product = product;
        this.unitName = unitName;
    }
    public ProductUnit() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @Column()
    private Integer AvaQuantity;
    @Column()
    private double SellingPrice;

    //nullable = true
    @Column()
    private String BarCode;
    @Column()
    private String QrCode;

/*
 @ManyToOne(fetch = FetchType.LAZY)
 */
    @ManyToOne(optional = false)
    @JoinColumn(name="ProductId", nullable=false, updatable=false)
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name="UnitId", nullable=false, updatable=false)
    private UnitName unitName;
/*

    - ProductId
    - UnitId

	- AvaQuantity
	- SellingPrice
	- BarCode
	- QrCode
 */

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UnitName getUnitName() {
        return unitName;
    }

    public void setUnitName(UnitName unitName) {
        this.unitName = unitName;
    }
}
