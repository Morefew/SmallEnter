package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.AlmacenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends CrudRepository<AlmacenEntity, Long> {
}