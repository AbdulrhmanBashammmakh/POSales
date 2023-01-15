package net.bashammmakh.POSales.Services.Products;


import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Repos.Products.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Category> getAll(){

        return categoryRepository.findAll();
    }

    public Category getById(Long id){

        return categoryRepository.findById(id).get();
    }

    public Category SaveItem(Category category){

        return categoryRepository.save(category);

    }

    public void Delete(Long id ){
        Category category =categoryRepository.findById(id).get();
        if (category != null) {
            this.categoryRepository.deleteById(id);
        }
    }



}
