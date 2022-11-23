package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.SuplidorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SuplidorRepository extends CrudRepository<SuplidorEntity, Long> {

    Optional<SuplidorEntity> findByEmpresa(String empresa);

    Optional<SuplidorEntity> findByRegistroNacional(String registroNacional);

    Optional<SuplidorEntity> findByIdSuplidor(Long suplidorId);

    Optional<SuplidorEntity> findByStatus(boolean statusSuplidor);
}