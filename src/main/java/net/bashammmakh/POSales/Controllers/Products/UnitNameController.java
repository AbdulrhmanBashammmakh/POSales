package net.bashammmakh.POSales.Controllers.Products;

import net.bashammmakh.POSales.Models.Products.UnitName;
import net.bashammmakh.POSales.Services.Products.UnitNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/units")
public class UnitNameController {


    @Autowired
    private UnitNameService unitNameService;

    @GetMapping(value = "/")
    public List<UnitName> GetItems (){

        return unitNameService.getAll();
    }

    @GetMapping(value = "/{id}")
    public UnitName GetItem (@PathVariable("id")  Long id){
        return unitNameService.getById(id);
    }

    @PostMapping(value = "/create")
    public UnitName insert(@RequestBody UnitName unitName){

        return unitNameService.SaveItem(unitName);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        unitNameService.Delete(id);
    }
    @PutMapping("/update")
    public UnitName UpdateItem(@RequestBody UnitName unitName){

        return unitNameService.SaveItem(unitName) ;
    }

}
