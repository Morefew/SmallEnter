package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.RecepcionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionRepository extends CrudRepository<RecepcionEntity, Long> {
}