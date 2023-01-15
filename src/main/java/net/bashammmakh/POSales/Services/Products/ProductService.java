package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.Product;
import net.bashammmakh.POSales.Repos.Products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;



    public List<Product> getAll(){

        return productRepository.findAll();
    }

    public Product getById(Long id){

        return productRepository.findById(id).get();
    }
}
