package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.FacturaEntity;
import com.example.SmallEnter.Model.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface FacturaRepository extends CrudRepository<FacturaEntity, Long> {
    Optional<FacturaEntity> findByNumeroComprobanteFiscal(String numeroComprobanteFiscal);

//    Optional<FacturaEntity> findByNumeroFactura(String numeroFactura);

//    Optional<FacturaEntity> findByPersonaId(PersonaEntity personaEntity);
    Optional<FacturaEntity> findByFechaCreada(Date fechaCreada);

}