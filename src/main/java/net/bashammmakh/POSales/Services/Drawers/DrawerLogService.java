package net.bashammmakh.POSales.Services.Drawers;

import net.bashammmakh.POSales.Models.Drawers.DrawerLog;
import net.bashammmakh.POSales.Repos.Drawers.DrawerLogRepos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawerLogService {

    @Autowired
private DrawerLogRepos Repository;

    @Autowired
    private ModelMapper modelMapper;
    public List<DrawerLog> getAll(){

        return Repository.findAll();
    }

    public DrawerLog getById(Long id){

        return Repository.findById(id).get();
    }



    public DrawerLog SaveItem(DrawerLog x){

        return Repository.save(x);

    }

    public void Delete(Long id ){
        DrawerLog x =Repository.findById(id).get();
        if (x != null) {
            this.Repository.deleteById(id);
        }
    }

}
