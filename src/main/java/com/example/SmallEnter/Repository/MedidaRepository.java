package com.example.SmallEnter.Repository;

import com.example.SmallEnter.Model.MedidaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @project: SmallEnter
 * @author: rsaldanar
 * @date: 27/11/22
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Repository
public interface MedidaRepository extends CrudRepository<MedidaEntity, Long> {


}
