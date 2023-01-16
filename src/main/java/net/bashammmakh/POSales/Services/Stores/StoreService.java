package net.bashammmakh.POSales.Services.Stores;


import net.bashammmakh.POSales.Models.Stores.Store;
import net.bashammmakh.POSales.Repos.Stores.StoreRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<Store> getAll(){

        return Repository.findAll();
    }

    public Store getById(Long id){

        return Repository.findById(id).get();
    }



    public Store SaveItem(Store x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        Store x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
