package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.CuentasPorPagarEntity;
import com.example.SmallEnter.Model.FacturaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface FacturaRepository extends CrudRepository<FacturaEntity, Long> {
    Optional<FacturaEntity> findByNCF(String ncf);

    Optional<FacturaEntity> findByNumeroFactura(String numeroFactura);

    Optional<FacturaEntity> findByPersonaId(Long personaId);
    Optional<FacturaEntity> findByFechaCreada(Date fechaCreada);

}