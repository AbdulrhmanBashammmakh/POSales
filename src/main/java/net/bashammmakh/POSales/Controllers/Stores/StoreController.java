package net.bashammmakh.POSales.Controllers.Stores;

import net.bashammmakh.POSales.Models.Stores.Store;
import net.bashammmakh.POSales.Services.Stores.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Store")
public class StoreController {
    @Autowired
    private StoreService Service;

    @GetMapping(value = "/")
    public List<Store> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public Store GetItem (@PathVariable("id")  Long id){

        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public Store insert(@RequestBody Store x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }
    @PutMapping("/update")
    public Store UpdateItem(@RequestBody Store x){

        return Service.SaveItem(x) ;
    }

}

