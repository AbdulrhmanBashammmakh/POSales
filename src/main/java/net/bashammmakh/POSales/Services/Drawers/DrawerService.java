package net.bashammmakh.POSales.Services.Drawers;

import net.bashammmakh.POSales.Models.Drawers.Drawer;
import net.bashammmakh.POSales.Repos.Drawers.DrawersRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawerService {
    @Autowired
    private DrawersRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<Drawer> getAll(){

        return Repository.findAll();
    }

    public Drawer getById(Long id){

        return Repository.findById(id).get();
    }



    public Drawer SaveItem(Drawer x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        Drawer x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
