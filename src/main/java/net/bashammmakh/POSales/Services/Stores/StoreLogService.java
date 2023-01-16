package net.bashammmakh.POSales.Services.Stores;


import net.bashammmakh.POSales.Models.Stores.StoreLog;
import net.bashammmakh.POSales.Repos.Stores.StoreLogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreLogService {
    @Autowired
    private StoreLogRepository Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<StoreLog> getAll(){

        return Repository.findAll();
    }

    public StoreLog getById(Long id){

        return Repository.findById(id).get();
    }



    public StoreLog SaveItem(StoreLog x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        StoreLog x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
