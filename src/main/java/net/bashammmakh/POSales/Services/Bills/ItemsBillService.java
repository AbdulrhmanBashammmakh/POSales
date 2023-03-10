package net.bashammmakh.POSales.Services.Bills;

import net.bashammmakh.POSales.Models.Bills.ItemsBill;
import net.bashammmakh.POSales.Repos.Bills.ItemsBillRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemsBillService {

    @Autowired
private ItemsBillRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<ItemsBill> getAll(){

        return Repository.findAll();
    }

    public ItemsBill getById(Long id){

        return Repository.findById(id).get();
    }


    @Transactional()
    public ItemsBill SaveItem(ItemsBill x){

      x.setSubTotal(x.getQuantity()*x.getRate());

        return Repository.save(x);

    }

    public void Delete(Long id ){
        ItemsBill x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
