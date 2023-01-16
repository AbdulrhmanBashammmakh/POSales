package net.bashammmakh.POSales.Controllers.Bills;

import net.bashammmakh.POSales.Models.Bills.Vendor;
import net.bashammmakh.POSales.Services.Bills.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vendor")
public class VendorController {

    @Autowired
    private VendorService Service;

    @GetMapping(value = "/")
    public List<Vendor> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public Vendor GetItem (@PathVariable("id")  Long id){
        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public Vendor insert(@RequestBody Vendor x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }
    @PutMapping("/update")
    public Vendor UpdateItem(@RequestBody Vendor x){

        return Service.SaveItem(x) ;
    }

}

