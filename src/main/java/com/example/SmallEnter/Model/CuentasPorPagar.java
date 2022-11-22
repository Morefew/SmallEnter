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
public class CuentasPorPagar implements Serializable {
    @Id
    @Column(name = "id_cuentasporpagar", nullable = false, unique = true)
    private Long idCuentasPorPagar;

    @ManyToOne
    @JoinColumn(name = "suplidor_id_suplidor")
    private SuplidorEntity idSuplidor;

    @ManyToMany
    @JoinColumn(name = "factura_id_factura")
    private List<FacturaEntity> idFactura;


}
