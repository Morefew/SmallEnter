package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.PersonaEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<PersonaEntity, Long> {
}