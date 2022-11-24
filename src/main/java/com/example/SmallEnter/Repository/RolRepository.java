package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.RolEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends CrudRepository<RolEntity, String> {
    Optional<RolEntity> findByRolId(Long rolId);
    Optional<RolEntity> findByRol(String rol);
    Optional<RolEntity> findByDescripcion(String descripcion);
}