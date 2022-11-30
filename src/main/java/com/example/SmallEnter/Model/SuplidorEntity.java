package com.example.SmallEnter.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "suplidor")
public class SuplidorEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suplidor_id", nullable = false, unique = true)
    private Long suplidorId;

    @Column(name = "empresa_suplidor")
    private String empresa;

    @Column(name = "nombre_representante_suplidor")
    private String nombre;

    @Column(name = "apellido_representante_suplidor")
    private String apellido;

    @Column(name = "registroNacional")
    private String registroNacional;

    @Column(name = "direccion_suplidor")
    private String direccion;

    @Column(name = "email_suplidor")
    private String email;

    @Column(name = "telefono_suplidor")
    private String telefono;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    // dias de credito que se le da al suplidor
    @Column(name = "dias_credito")
    private int diasCredito;

    @Column(name = "status")
    private boolean status;
}
