package net.bashammmakh.POSales.Services.Products;

import net.bashammmakh.POSales.Models.Products.UnitName;
import net.bashammmakh.POSales.Repos.Products.UnitNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitNameService {

    @Autowired
    private UnitNameRepository unitNameRepository;


    public List<UnitName> getAll(){

        return unitNameRepository.findAll();
    }

    public UnitName getById(Long id){

        return unitNameRepository.findById(id).get();
    }
}
