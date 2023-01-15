package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.ProductCost;
import net.bashammmakh.POSales.Repos.Products.ProductCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCostService {

    @Autowired
    private ProductCostRepository productCostRepository;


    public List<ProductCost> getAll(){

        return productCostRepository.findAll();
    }

    public ProductCost getById(Long id){

        return productCostRepository.findById(id).get();
    }
}
