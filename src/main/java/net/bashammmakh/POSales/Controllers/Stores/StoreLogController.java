package net.bashammmakh.POSales.Controllers.Stores;

import net.bashammmakh.POSales.Models.Stores.StoreLog;
import net.bashammmakh.POSales.Services.Stores.StoreLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Store-log")
public class StoreLogController {

    @Autowired
    private StoreLogService Service;

    @GetMapping(value = "/")
    public List<StoreLog> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public StoreLog GetItem (@PathVariable("id")  Long id){

        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public StoreLog insert(@RequestBody StoreLog x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }
    @PutMapping("/update")
    public StoreLog UpdateItem(@RequestBody StoreLog x){

        return Service.SaveItem(x) ;
    }

}

