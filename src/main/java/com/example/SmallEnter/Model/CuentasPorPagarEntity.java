package com.example.SmallEnter.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cuentasporpagar")
public class CuentasPorPagarEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuentasporpagar_id", nullable = false, unique = true)
    private Long cuentasPorPagarId;

    @ManyToOne
    @JoinColumn(name = "suplidor_id_suplidor")
    private SuplidorEntity suplidorEntity;

    @ManyToOne
    @JoinColumn(name = "recepcion_id_recepcion")
    private RecepcionEntity recepcionEntity;

    @Column(name = "total")
    private Double total;

    @Column(name = "status")
    private boolean status;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_de_pago")
    private Date fechaDePago;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_de_vencimiento")
    private Date fechaDeVencimiento;



}
