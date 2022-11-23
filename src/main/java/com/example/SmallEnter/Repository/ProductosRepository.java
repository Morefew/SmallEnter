package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.ProductosEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository<ProductosEntity, Long> {
}