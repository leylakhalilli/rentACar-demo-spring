package com.example.rentACar.business.abstracts;

import com.example.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
