package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.UnitName;
import net.bashammmakh.POSales.Repos.Products.UnitNameRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitNameService {

    @Autowired
    private UnitNameRepository unitNameRepository;

    @Autowired
    private ModelMapper modelMapper;
    public List<UnitName> getAll(){

        return unitNameRepository.findAll();
    }

    public UnitName getById(Long id){

        return unitNameRepository.findById(id).get();
    }



    public UnitName SaveItem(UnitName unitName){

        return unitNameRepository.save(unitName);

    }

    public void Delete(Long id ){
        UnitName unitName =unitNameRepository.findById(id).get();
        if (unitName != null) {
            this.unitNameRepository.deleteById(id);
        }
    }

}
