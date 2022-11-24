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
    @Column(name = "ordenes_de_compra_id", nullable = false, unique = true)
    private Long ordenId;

    @Column(name = "numero_ordenes_de_compra")
    private String numeroOrden;

    @Column(name = "NCF")
    private String ncf;

    @ManyToOne
    @JoinColumn(name = "suplidor_id_suplidor")
    private SuplidorEntity suplidorEntity;

    @Column(name = "producto_uno")
    private String productoUno;
    @Column(name = "precio_unidad_uno")
    private double precioUnidadUno;
    @Column(name = "unidades_producto_uno")
    private int unidadesProductoUno;
    @Column(name = "importe_producto_uno")
    private double importeProductoUno;

    @Column(name = "producto_dos")
    private String productoDos;
    @Column(name = "precio_unidad_dos")
    private double precioUnidadDos;
    @Column(name = "unidades_producto_dos")
    private int unidadesProductoDos;
    @Column(name = "importe_producto_dos")
    private double importeProductoDos;

    @Column(name = "producto_tres")
    private String productoTres;
    @Column(name = "precio_unidad_tres")
    private double precioUnidadTres;
    @Column(name = "unidades_producto_tres")
    private int unidadesProductoTres;
    @Column(name = "importe_producto_Tres")
    private double importeProductoTres;

    @Column(name = "producto_cuatro")
    private String productoCuatro;
    @Column(name = "precio_unidad_cuatro")
    private double precioUnidadCuatro;
    @Column(name = "unidades_producto_cuatro")
    private int unidadesProductoCuatro;
    @Column(name = "importe_producto_cuatro")
    private double importeProductoCuatro;

    @Column(name = "producto_cinco")
    private String productoCinco;
    @Column(name = "precio_unidad_cinco")
    private double precioUnidadCinco;
    @Column(name = "unidades_producto_cinco")
    private int unidadesProductoCinco;
    @Column(name = "importe_producto_cinco")
    private double importeProductoCinco;

    @Column(name = "producto_seis")
    private String productoSeis;
    @Column(name = "precio_unidad_seis")
    private double precioUnidadSeis;
    @Column(name = "unidades_producto_seis")
    private int unidadesProductoSeis;
    @Column(name = "importe_producto_seis")
    private double importeProductoSeis;

    @Column(name = "producto_siete")
    private String productoSiete;
    @Column(name = "precio_unidad_siete")
    private double precioUnidadSiete;
    @Column(name = "unidades_producto_siete")
    private int unidadesProductoSiete;
    @Column(name = "importe_producto_siete")
    private double importeProductoSiete;

    @Column(name = "producto_ocho")
    private String productoOcho;
    @Column(name = "precio_unidad_ocho")
    private double precioUnidadOcho;
    @Column(name = "unidades_producto_ocho")
    private int unidadesProductoOcho;
    @Column(name = "importe_producto_ocho")
    private double importeProductoOcho;

    @Column(name = "producto_nueve")
    private String productoNueve;
    @Column(name = "precio_unidad_nueve")
    private double precioUnidadNueve;
    @Column(name = "unidades_producto_nueve")
    private int unidadesProductoNueve;
    @Column(name = "importe_producto_nueve")
    private double importeProductoNueve;

    @Column(name = "producto_diez")
    private String productoDiez;
    @Column(name = "precio_unidad_diez")
    private double precioUnidadDiez;
    @Column(name = "unidades_producto_diez")
    private int unidadesProductoDiez;
    @Column(name = "importe_producto_Diez")
    private double importeProductoDiez;

    @Column(name = "producto_once")
    private String productoOnce;
    @Column(name = "precio_unidad_once")
    private double precioUnidadOnce;
    @Column(name = "unidades_producto_once")
    private int unidadesProductoOnce;
    @Column(name = "importe_producto_once")
    private double importeProductoOnce;

    @Column(name = "producto_doce")
    private String productoDoce;
    @Column(name = "precio_unidad_doce")
    private double precioUnidadDoce;
    @Column(name = "unidades_producto_doce")
    private int unidadesProductoDoce;
    @Column(name = "importe_producto_doce")
    private double importeProductoDoce;

    @Column(name = "producto_trece")
    private String productoTrece;
    @Column(name = "precio_unidad_trece")
    private double precioUnidadTrece;
    @Column(name = "unidades_producto_trece")
    private int unidadesProductoTrece;
    @Column(name = "importe_producto_trece")
    private double importeProductoTrece;

    @Column(name = "producto_catorce")
    private String productoCatorce;
    @Column(name = "precio_unidad_catorce")
    private double precioUnidadCatorce;
    @Column(name = "unidades_producto_catorce")
    private int unidadesProductoCatorce;
    @Column(name = "importe_producto_Catorce")
    private double importeProductoCatorce;

    @Column(name = "producto_quince")
    private String productoQuince;
    @Column(name = "precio_unidad_quince")
    private double precioUnidadQuince;
    @Column(name = "unidades_producto_quince")
    private int unidadesProductoQuince;
    @Column(name = "importe_producto_quince")
    private double importeProductoQuince;

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

    @Column(name = "pagada")
    private boolean pagada;

    @Column(name = "status")
    private boolean status;
}
