package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.OrdenesDeCompraEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface OrdenesDeCompraRepository extends CrudRepository<OrdenesDeCompraEntity, Long> {
    Optional<OrdenesDeCompraEntity> findByNumeroOrden(String numeroOrden);

    Optional<OrdenesDeCompraEntity> findByFechaCreada(Date fechaCreada);

    Optional<OrdenesDeCompraEntity> findBySuplidorId(Long suplidorId);

    Optional<OrdenesDeCompraEntity> findByStatus(boolean status);
}