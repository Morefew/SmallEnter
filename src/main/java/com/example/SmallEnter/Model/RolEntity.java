package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "rol")
public class RolEntity implements Serializable {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id", nullable = false, unique = true)
    private String rolId;

    // Rol
    @Column(name = "rol")
    private String rol;

    // Descripción del rol
    @Column(name = "descripcion")
    private String descripcion;

    // Estado del rol
    @Column(name = "estado")
    private boolean estado;

}
