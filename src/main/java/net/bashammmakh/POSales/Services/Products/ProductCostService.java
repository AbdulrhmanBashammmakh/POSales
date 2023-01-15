package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.ProductCost;
import net.bashammmakh.POSales.Repos.Products.ProductCostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCostService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductCostRepository productCostRepository;


    public List<ProductCost> getAll(){

        return productCostRepository.findAll();
    }

    public ProductCost getById(Long id){

        return productCostRepository.findById(id).get();
    }
    public ProductCost SaveItem(ProductCost product){

        return productCostRepository.save(product);

    }

    public void Delete(Long id ){
        ProductCost product =productCostRepository.findById(id).get();
        if (product != null) {
            this.productCostRepository.deleteById(id);
        }
    }

}
