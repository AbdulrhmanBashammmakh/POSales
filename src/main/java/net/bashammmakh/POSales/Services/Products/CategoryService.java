package net.bashammmakh.POSales.Services.Products;


import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Repos.Products.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){

        return categoryRepository.findAll();
    }

    public Category getById(Long id){

        return categoryRepository.findById(id).get();
    }

}
