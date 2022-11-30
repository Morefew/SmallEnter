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
@Table(name = "compras")
public class ComprasEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compras_id", nullable = false, unique = true)
    private Long comprasId;

    @Column(name = "responsable")
    private String responsable;

    @Column(name = "codigo")
    private String codigo;

    @JoinColumn(name = "almacen_id")
    @ManyToOne
    private AlmacenEntity almacenEntity;

    @JoinColumn(name = "suplidore_id")
    @ManyToOne
    private SuplidorEntity suplidorEntity;

    @JoinColumn(name = "producto_id")
    @OneToMany
    private List<ProductosEntity> productoEntity;

    @Column(name = "cantidad")
    private double cantidad;

    @Column(name = "monto")
    private double monto;

    @Column(name = "total")
    private double total;

    @Column(name = "proceso_altual")
    private String procesoActual;

    @Column(name = "precio")
    private double precio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

}
