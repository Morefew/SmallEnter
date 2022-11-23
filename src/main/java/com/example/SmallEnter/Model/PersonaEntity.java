package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id", nullable = false, unique = true)
    private Long idPersona;

    @Column(name = "nombre_persona")
    private String nombre;

    @Column(name = "apellido_persona")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "rol_id_rol")
    private RolEntity rolEntity;

    @Column(name = "usuario_persona")
    private String nombre_usuario;

    @Column(name = "contrasena_persona")
    private String contrasena;

    @Column(name = "direccion_persona")
    private String direccion;

    @Column(name = "email_persona")
    private String email;

    @Column(name = "telefono_persona")
    private String telefono;

    @Column(name = "fecha_de_registro_persona")
    private String fechaDeRegistro;

    @Column(name = "status_persona")
    private boolean persona_status;
}
