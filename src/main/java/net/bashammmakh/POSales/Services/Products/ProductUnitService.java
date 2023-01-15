package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.ProductUnit;
import net.bashammmakh.POSales.Repos.Products.ProductUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUnitService {


    @Autowired
    private ProductUnitRepository productUnitRepository;



    public List<ProductUnit> getAll(){

        return productUnitRepository.findAll();
    }

    public ProductUnit getById(Long id){

        return productUnitRepository.findById(id).get();
    }
}
