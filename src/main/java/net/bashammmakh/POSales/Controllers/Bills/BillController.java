package net.bashammmakh.POSales.Controllers.Bills;

import net.bashammmakh.POSales.Models.Bills.Bill;
import net.bashammmakh.POSales.Services.Bills.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bill")
public class BillController {

    @Autowired
    private BillService Service;
    @GetMapping(value = "/")
    public List<Bill> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public Bill GetItem (@PathVariable("id")  Long id){
        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public Bill insert(@RequestBody Bill x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }
    @PutMapping("/update")
    public Bill UpdateItem(@RequestBody Bill x){

        return Service.SaveItem(x) ;
    }

}

