package com.praktikum.service;

import com.praktikum.model.Brand;
import com.praktikum.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Optional<Brand> findBrandById(Long id) {
        return brandRepository.findById(id);
    }

    public List<Brand> findAllBrand() {
        return brandRepository.findAll();
    }

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    public Optional<Brand> updateBrand(Long id, Brand brand) {
        Optional<Brand> brandById = brandRepository.findById(id);

        brandById.ifPresent(res -> {
            res.setBrandName(brand.getBrandName());

            brandRepository.save(res);
        });
        return brandById;
    }

    public void deleteBrand(Long id) {
        Optional<Brand> brandById = brandRepository.findById(id);

        brandById.ifPresent(res -> {
            brandRepository.delete(res);
        });
    }
}
