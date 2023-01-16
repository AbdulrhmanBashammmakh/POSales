package net.bashammmakh.POSales.Controllers.Bills;

import net.bashammmakh.POSales.Models.Bills.ItemsBill;
import net.bashammmakh.POSales.Services.Bills.ItemsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ItemsBill")
public class ItemsBillController {

    @Autowired
    private ItemsBillService Service;



    @GetMapping(value = "/")
    public List<ItemsBill> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public ItemsBill GetItem (@PathVariable("id")  Long id){
        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public ItemsBill insert(@RequestBody ItemsBill x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }
    @PutMapping("/update")
    public ItemsBill UpdateItem(@RequestBody ItemsBill x){

        return Service.SaveItem(x) ;
    }

}

