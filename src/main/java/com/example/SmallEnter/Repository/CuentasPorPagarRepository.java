package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.CuentasPorPagarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface CuentasPorPagarRepository extends CrudRepository<CuentasPorPagarEntity, Long> {
    Optional<CuentasPorPagarEntity> findBySuplidorId(Long suplidorId);
    Optional<CuentasPorPagarEntity> findByStatusCuenta(boolean statusCuenta);
}