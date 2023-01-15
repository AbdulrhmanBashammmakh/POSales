package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.Product;
import net.bashammmakh.POSales.Repos.Products.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Product> getAll(){

        return productRepository.findAll();
    }

    public Product getById(Long id){

        return productRepository.findById(id).get();
    }


    public Product SaveItem(Product product){

        return productRepository.save(product);

    }

    public void Delete(Long id ){
        Product product =productRepository.findById(id).get();
        if (product != null) {
            this.productRepository.deleteById(id);
        }
    }

}
