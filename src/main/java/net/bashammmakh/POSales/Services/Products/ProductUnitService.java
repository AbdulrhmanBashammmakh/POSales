package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.ProductUnit;
import net.bashammmakh.POSales.Repos.Products.ProductUnitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUnitService {


    @Autowired
    private ProductUnitRepository productUnitRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductUnit> getAll(){

        return productUnitRepository.findAll();
    }

    public ProductUnit getById(Long id){

        return productUnitRepository.findById(id).get();
    }



    public ProductUnit SaveItem(ProductUnit product){

        return productUnitRepository.save(product);

    }

    public void Delete(Long id ){
        ProductUnit product =productUnitRepository.findById(id).get();
        if (product != null) {
            this.productUnitRepository.deleteById(id);
        }
    }

}

