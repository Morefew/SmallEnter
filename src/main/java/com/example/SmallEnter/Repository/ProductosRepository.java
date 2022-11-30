package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.ProductosEntity;
import com.example.SmallEnter.Model.SuplidorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductosRepository extends CrudRepository<ProductosEntity, Long> {

//    Optional<ProductosEntity> findByProductoId (Long productoId);
//
//    Optional<ProductosEntity> findByDescripcion (String descripcion);
//
//    Optional<ProductosEntity> findByReferencia (String referencia);
//
//    Optional<ProductosEntity> findByMarca(String marca);
//
//    Optional<ProductosEntity> findByModelo(String modelo);
//
//    Optional<ProductosEntity> findByVersion(String version);

}