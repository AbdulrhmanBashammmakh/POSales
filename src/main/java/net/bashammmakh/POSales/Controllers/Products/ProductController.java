package net.bashammmakh.POSales.Controllers.Products;

import net.bashammmakh.POSales.Models.Products.Product;
import net.bashammmakh.POSales.Services.Products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public List<Product> GetItems (){

        return productService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Product GetItem (@PathVariable("id")  Long id){


        return productService.getById(id);
    }

    @PostMapping(value = "/create")
    public Product insert(@RequestBody Product product){

        return productService.SaveItem(product);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        productService.Delete(id);
    }
    @PutMapping("/update")
    public Product UpdateItem(@RequestBody Product x){

        return productService.SaveItem(x) ;
    }

}

