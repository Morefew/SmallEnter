package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "factura")
public class FacturaEntity {
    @Id
    @Column(name = "id_factura", nullable = false)
    private Long idFactura;

    @Column(name = "numero_factura")
    private String numeroFactura;

    @Column(name = "NCF")
    private String ncf;

    @Column(name = "producto")
    private String producto;

    @Column(name = "precio_unidad")
    private double precioUnidad;

    @Column(name = "unidades_producto")
    private int unidadesProducto;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "impuestos")
    private double impuestos;

    @Column(name = "total")
    private Double total;

    @Column(name = "fecha_creada")
    private Date fechaCreada;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @Column(name = "pagada")
    private boolean pagada;

}