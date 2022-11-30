package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "factura")
public class FacturaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id", nullable = false, unique = true)
    private Long facturaId;

    @Column(name = "numero_factura")
    private String numeroFactura;

    @Column(name = "ncf")
    private String ncf;

    @ManyToOne
    @JoinColumn(name = "persona_id_persona")
    private PersonaEntity personaEntity;

    @JoinColumn(name = "cajera_nombre")
    private PersonaEntity cajeraNombre;

    @ManyToOne
    @JoinColumn(name = "almacen_id")
    private AlmacenEntity almacenEntity;

    @ManyToOne
    @JoinColumn(name = "recepcionProducto_id")
    private RecepcionEntity recepcionProductoEntity;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "descuento")
    private double descuento;

    @Column(name = "impuestos")
    private double impuestos;

    @Column(name = "total")
    private Double total;

    @Column(name = "fecha_creada")
    private Date fechaCreada;

    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    // Si la factura no se salda en el momento pasas a cuentas por cobrar, de lo contrario pasa al histórico del cliente.
    @Column(name = "pagada")
    private boolean pagada;

}