package com.example.SmallEnter.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cuentasporpagar")
public class CuentasPorPagar {
    @Id
    @Column(name = "id_cuentasporpagar", nullable = false)
    private Long idcuentasPorPagar;

    @ManyToOne
    @JoinColumn(name = "suplidor_cuentasporpagar")
    private SuplidorEntity idSuplidor;

    @ManyToMany
    @JoinColumn(name = "factura_cuentasporpagar")
    private List<FacturaEntity> idFactura;


}
