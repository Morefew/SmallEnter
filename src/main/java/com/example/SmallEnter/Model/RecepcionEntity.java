package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "recepcion")
public class RecepcionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recepcion_id", nullable = false, unique = true)
    private Long recepcionId;

    @ManyToOne
    @JoinColumn(name = "almacen_id")
    private AlmacenEntity almacenEntity;

    @Column(name = "responsable")
    private String responsable;

    @Temporal(TemporalType.DATE)
    @Column(name = "vencimiento_producto")
    private Date vencimientoProducto;

    @ManyToOne
    @JoinColumn(name = "orden_compra_id")
    private OrdenesDeCompraEntity ordenesDeCompraEntity;

    @Column(name = "cantidad_entrada")
    private double cantidadEntrada;

    @Column(name = "cantidad_salida")
    private double cantidadSalida;

    @Column(name = "precio_a")
    private double precioA;

    @Column(name = "precio_b")
    private double precioB;

    @Column(name = "precio_c")
    private double precioC;

    @Column(name = "estado")
    private boolean estado;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_entrada")
    private Date fechaEntrada;

}
