package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.CuentasPorPagarEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CuentasPorPagarRepository extends CrudRepository<CuentasPorPagarEntity, Long> {
    Optional<CuentasPorPagarEntity> findByNCF(String ncf);

    Optional<CuentasPorPagarEntity> findByNumeroOrden(String numeroOrden);

    Optional<CuentasPorPagarEntity> findByIdSuplidor(Long suplidorId);
}