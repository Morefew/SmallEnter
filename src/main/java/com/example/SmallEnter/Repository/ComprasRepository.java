package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.ComprasEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends CrudRepository<ComprasEntity, Long> {
}