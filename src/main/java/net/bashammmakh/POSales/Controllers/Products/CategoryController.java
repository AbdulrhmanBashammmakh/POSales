package net.bashammmakh.POSales.Controllers.Products;


import net.bashammmakh.POSales.DTOs.Products.CategoryDto;
import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Services.Products.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    /*
    @RequestBody
     */
    @Autowired
    private CategoryService categoryService;


    @GetMapping(value = "/")
    public List<CategoryDto> GetItems (){
        return categoryService.getAll();
    }

    @GetMapping(value = "/{id}")
    public CategoryDto GetItem (@PathVariable("id")  Long id){
        return categoryService.getById(id);
    }

    @PostMapping(value = "/create")
    public Category insert(@RequestBody CategoryDto category){
    return categoryService.SaveItem(category);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){
        categoryService.Delete(id);
    }
    @PutMapping("/update")
    public Category UpdateItem(@RequestBody CategoryDto category){

        return categoryService.SaveItem(category) ;
    }


}
