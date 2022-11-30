package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @project: SmallEnter
 * @author: rsaldanar
 * @date: 27/11/22
 * @Correo: rsaldanar@gmail.com
 * @description:
 * @history:
 */
@Entity
@Table(name = "medida")
@Getter
@Setter
public class MedidaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medida_id", nullable = false, unique = true)
    private Long medidaId;

    @Column(name = "abreviatura")
    private String abreviatura;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private boolean estado;


}
