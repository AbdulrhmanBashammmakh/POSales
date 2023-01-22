package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.ProductCost;
import net.bashammmakh.POSales.Models.Products.ProductUnit;
import net.bashammmakh.POSales.Models.Stores.Store;
import net.bashammmakh.POSales.Models.Stores.StoreLog;
import net.bashammmakh.POSales.Repos.Products.ProductCostRepository;
import net.bashammmakh.POSales.Services.Stores.StoreLogService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductCostService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private StoreLogService storeLogService;
    @Autowired
    private ProductCostRepository productCostRepository;

    @Autowired
    private  ProductService productService;

    @Autowired
    private ProductUnitService productUnitService;


    public List<ProductCost> getAll(){

        return productCostRepository.findAll();
    }

    public ProductCost getById(Long id){

        return productCostRepository.findById(id).get();
    }
    public ProductCost SaveItem(ProductCost productCost){

        return productCostRepository.save(productCost);

    }

    @Transactional()
    public ProductCost InsertNew (ProductCost productCost){

            //  Block of code to try
            ProductCost pro = productCostRepository.save(productCost);
            ProductUnit productUnit = productUnitService.getById(productCost.getProduct().getID()) ;
           int xQty = productUnit.getAvaQuantity() + productCost.getAvaQtyNow();
            productUnit.setAvaQuantity(xQty);
        System.out.println("*** xQty now = ****" + xQty);
            if(productCost.getCostPrice()>productUnit.getSellingPrice() ){
                productUnit.setSellingPrice(productCost.getCostPrice());
            }
            System.out.println("*** Done ****");
            productUnitService.SaveItem(productUnit);
            Store st = new Store();
            st.setID(1);
        StoreLog storeLog = new StoreLog(false,st,pro,pro.getProduct().getID(),true, LocalDate.now());
            storeLogService.SaveItem(storeLog);

        return pro;

    }

    public void Delete(Long id ){

        if (productCostRepository.findById(id).isPresent()) {
            this.productCostRepository.deleteById(id);
        }
    }

}
