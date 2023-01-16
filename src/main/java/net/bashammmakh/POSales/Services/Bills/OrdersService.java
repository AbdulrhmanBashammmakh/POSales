package net.bashammmakh.POSales.Services.Bills;

import net.bashammmakh.POSales.Models.Bills.Orders;
import net.bashammmakh.POSales.Repos.Bills.OrdersRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<Orders> getAll(){

        return Repository.findAll();
    }

    public Orders getById(Long id){

        return Repository.findById(id).get();
    }



    public Orders SaveItem(Orders x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        Orders x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
