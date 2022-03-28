package com.praktikum.service;

import com.praktikum.model.Category;
import com.praktikum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> updateCategory(Long id, Category category) {
        Optional<Category> categoryById = categoryRepository.findById(id);

        categoryById.ifPresent(res -> {
            res.setCategoryName(category.getCategoryName());

            categoryRepository.save(res);
        });
        return categoryById;
    }

    public void deleteCategory(Long id) {
        Optional<Category> cateogryById = categoryRepository.findById(id);

        cateogryById.ifPresent(res -> {
            categoryRepository.delete(res);
        });
    }
}
