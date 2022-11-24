package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cuentasporpagar")
public class CuentasPorPagarEntity implements Serializable {
    @Id
    @Column(name = "cuentasporpagar_id", nullable = false, unique = true)
    private Long cuentasPorPagarId;

    @ManyToOne
    @JoinColumn(name = "suplidor_id_suplidor")
    private SuplidorEntity suplidorId;

    @OneToMany
    @JoinColumn(name = "factura_id_factura")
    private List<FacturaEntity> facturaId;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "impuestos")
    private double impuestos;

    @Column(name = "total")
    private Double total;

    @Column(name = "status_CPP")
    private boolean statusCuenta;
}
