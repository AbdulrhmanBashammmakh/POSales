package net.bashammmakh.POSales.Services.Products;


import net.bashammmakh.POSales.DTOs.Products.CategoryDto;
import net.bashammmakh.POSales.Models.Products.Category;
import net.bashammmakh.POSales.Repos.Products.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CategoryDto> getAll(){
        List<Category> categories = categoryRepository.findAll();
        List<CategoryDto> categoryDtos =new ArrayList<>();
       for (int i=0 ;i <categories.size();i++){
           CategoryDto categoryDto = modelMapper.map(categories.get(i),CategoryDto.class);
           categoryDtos.add(categoryDto);
       }

        return  categoryDtos;
    }

    public CategoryDto getById(Long id){
        Category cate = categoryRepository.findById(id).get();
        CategoryDto cateDto =modelMapper.map(cate, CategoryDto.class);
        return cateDto;
    }

    public Category SaveItem(CategoryDto categoryDto){
     Category category =modelMapper.map(categoryDto,Category.class);

        return categoryRepository.save(category);

    }

    public void Delete(Long id ){
        Category category =categoryRepository.findById(id).get();
        if (category != null) {
            this.categoryRepository.deleteById(id);
        }
    }



}
