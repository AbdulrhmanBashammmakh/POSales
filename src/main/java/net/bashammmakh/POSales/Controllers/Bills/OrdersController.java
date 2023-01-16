package net.bashammmakh.POSales.Controllers.Bills;

import net.bashammmakh.POSales.Models.Bills.Orders;
import net.bashammmakh.POSales.Services.Bills.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private OrdersService Service;


    @GetMapping(value = "/")
    public List<Orders> GetItems (){

        return Service.getAll();
    }

    @GetMapping(value = "/{id}")
    public Orders GetItem (@PathVariable("id")  Long id){


        return Service.getById(id);
    }

    @PostMapping(value = "/create")
    public Orders insert(@RequestBody Orders x){

        return Service.SaveItem(x);
    }

    @DeleteMapping("/del/{id}")
    public void deleteCate(@PathVariable("id")  Long id ){

        Service.Delete(id);
    }

    @PutMapping("/update")
    public Orders UpdateItem(@RequestBody Orders x){

        return Service.SaveItem(x) ;
    }

}

