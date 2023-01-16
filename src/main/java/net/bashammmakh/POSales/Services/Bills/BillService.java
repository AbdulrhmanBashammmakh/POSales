package net.bashammmakh.POSales.Services.Bills;

import net.bashammmakh.POSales.Models.Bills.Bill;
import net.bashammmakh.POSales.Repos.Bills.BillRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
private BillRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<Bill> getAll(){

        return Repository.findAll();
    }

    public Bill getById(Long id){

        return Repository.findById(id).get();
    }



    public Bill SaveItem(Bill x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        Bill x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
