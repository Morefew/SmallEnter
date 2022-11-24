package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.CuentasPorPagarEntity;
import com.example.SmallEnter.Model.OrdenesDeCompraEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface CuentasPorPagarRepository extends CrudRepository<CuentasPorPagarEntity, Long> {
    Optional<CuentasPorPagarEntity> findByNCF(String ncf);

    Optional<CuentasPorPagarEntity> findBySuplidorId(Long suplidorId);

    Optional<CuentasPorPagarEntity> findByFechaCreada(Date fechaCreada);

    Optional<CuentasPorPagarEntity> findByPagada(boolean pagada);
    Optional<CuentasPorPagarEntity> findByStatus(boolean status);
}