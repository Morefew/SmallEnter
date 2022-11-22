package com.example.SmallEnter.Model;

import com.sun.tools.javac.util.List;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "suplidor")
public class SuplidorEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suplidor", nullable = false, unique = true)
    private Long idSuplidor;

    @Column(name = "empresa_suplidor")
    private String empresa;

    @Column(name = "nombre_representante_suplidor")
    private String nombre;

    @Column(name = "apellido_representante_suplidor")
    private String apellido;

    @Column(name = "rnc_cedula_suplidor")
    private String registroNacional;

    @Column(name = "direccion_suplidor")
    private String direccion;

    @Column(name = "email_suplidor")
    private String email;

    @Column(name = "telefono_suplidor")
    private String telefono;

    @Column(name = "fecha_de_registro_suplidor")
    private String fechaDeRegistro;

    @Column(name = "credito")
    private int credito;

    @OneToMany
    @JoinColumn(name = "cuentas_por_pagar_suplidor")
    private List<FacturaEntity> cuentasPorPagarEntity;

    @OneToMany
    @JoinColumn(name = "cuentas_por_cobrar_suplidor")
    private List<FacturaEntity> cuentasPorCobrarEntity;

    @Column(name = "status_suplidor")
    private boolean statusSuplidor;
}