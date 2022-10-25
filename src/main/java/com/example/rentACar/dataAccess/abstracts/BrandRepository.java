package com.example.rentACar.dataAccess.abstracts;

import com.example.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();

}
