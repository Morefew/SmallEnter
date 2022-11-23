package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.PersonaEntity;
import com.example.SmallEnter.Model.RolEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonaRepository extends CrudRepository<PersonaEntity, Long> {
    @Override
    Optional<PersonaEntity> findById(Long personaId);
    Optional<PersonaEntity> findByNombre(String nombrePersona);
    Optional<PersonaEntity> findByApellido(String apellidoPersona);
    Optional<PersonaEntity> findByRol(RolEntity rolEntity);
}