package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ordenesdecompra")
public class OrdenesDeCompraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_id", nullable = false, unique = true)
    private Long ordenId;

    @Column(name = "documento_entrada")
    private String documentoEntrada;

    @ManyToOne
    @JoinColumn(name = "suplidor_id_suplidor")
    private SuplidorEntity suplidorEntity;

    @ManyToOne
    @JoinColumn(name = "creado")
    private PersonaEntity personaEntity;

    @ManyToOne
    @JoinColumn(name = "producto")
    private ProductosEntity productosEntity;

    @Column(name = "cantidad")
    private double[] cantidad;

    @Column(name = "impuestos")
    private double[] impuestos;

    @Column(name = "subtotal")
    private double[] subtotal;

    @Column(name = "total")
    private Double total;

    @Column(name = "fecha_creada")
    private Date fechaCreada;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @Column(name = "estado")
    private boolean estado;

}
