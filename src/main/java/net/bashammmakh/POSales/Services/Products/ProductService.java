package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.Product;
import net.bashammmakh.POSales.Models.Products.ProductUnit;
import net.bashammmakh.POSales.Models.Products.UnitName;
import net.bashammmakh.POSales.Repos.Products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductUnitService productUnitService;

    @Autowired
    private UnitNameService unitNameService;
/*
    @Autowired
    private ModelMapper modelMapper;
*/
    public List<Product> getAll(){

        return productRepository.findAll();
    }

    public Product getById(Long id){

        return productRepository.findById(id).get();
    }

    @Transactional()
    public Product InsertNew (Product product){
        Product pro= productRepository.save(product);
        System.out.println("Save product");
        UnitName unitName = unitNameService.getById(1L);
        System.out.println("Choice defualt unit");
        ProductUnit productUnit = new ProductUnit(0.0,0,"","",pro,unitName);
        System.out.println("Inserted Done");

        productUnitService.SaveItem(productUnit);

        return pro;

    }

    public Product SaveItem(Product product){

        return productRepository.save(product);

    }

    public void Delete(Long id ){
       // Product product =productRepository.findById(id).get();
        if (productRepository.findById(id).isPresent()) {
            this.productRepository.deleteById(id);
        }
    }

}
