package net.bashammmakh.POSales.Controllers.Products;

import net.bashammmakh.POSales.Models.Products.ProductCost;
import net.bashammmakh.POSales.Services.Products.ProductCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product-cost")
public class ProductCostController {


    @Autowired
    private ProductCostService productCostService;

    @GetMapping(value = "/")
    public List<ProductCost> GetItems (){

        return productCostService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ProductCost GetItem (@PathVariable("id")  Long id){
        return productCostService.getById(id);
    }

    @PostMapping(value = "/create")
    public ProductCost insert(@RequestBody ProductCost x){

        return productCostService.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        productCostService.Delete(id);
    }
    @PutMapping("/update")
    public ProductCost UpdateItem(@RequestBody ProductCost productCost){

        return productCostService.SaveItem(productCost) ;
    }

}

