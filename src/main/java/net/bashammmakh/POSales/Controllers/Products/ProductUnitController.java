package net.bashammmakh.POSales.Controllers.Products;

import net.bashammmakh.POSales.Models.Products.ProductUnit;
import net.bashammmakh.POSales.Services.Products.ProductUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Product-unit")
public class ProductUnitController {


    @Autowired
    private ProductUnitService productUnitService;

    @GetMapping(value = "/")
    public List<ProductUnit> GetItems (){

        return productUnitService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ProductUnit GetItem (@PathVariable("id")  Long id){
        return productUnitService.getById(id);
    }

    @PostMapping(value = "/create")
    public ProductUnit insert(@RequestBody ProductUnit productUnit){

        return productUnitService.SaveItem(productUnit);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        productUnitService.Delete(id);
    }
    @PutMapping("/update")
    public ProductUnit UpdateItem(@RequestBody ProductUnit productUnit){

        return productUnitService.SaveItem(productUnit) ;
    }

}

