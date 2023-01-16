package net.bashammmakh.POSales.Services.Bills;

import net.bashammmakh.POSales.Models.Bills.Vendor;
import net.bashammmakh.POSales.Repos.Bills.VendorRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService { @Autowired
private VendorRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<Vendor> getAll(){

        return Repository.findAll();
    }

    public Vendor getById(Long id){

        return Repository.findById(id).get();
    }



    public Vendor SaveItem(Vendor x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        Vendor x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
