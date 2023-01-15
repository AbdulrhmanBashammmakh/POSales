package net.bashammmakh.POSales.Controllers.Products;


import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Services.Products.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    /*
    @RequestBody
     */
    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "cates")
    public List<Category> GetItems (){
        return categoryService.getAll();
    }

    @GetMapping(value = "cate/{id}")
    public Category GetItem (@PathVariable("id")  Long id){
        return categoryService.getById(id);
    }

    @PostMapping(value = "cate")
    public Category insert(@RequestBody Category category){
    return categoryService.SaveItem(category);
    }

    @DeleteMapping("cate/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){
        categoryService.Delete(id);
    }
    @PutMapping("/cate")
    public Category UpdateItem(@RequestBody Category category){

        return categoryService.SaveItem(category) ;
    }


}
