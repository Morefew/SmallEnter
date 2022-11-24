package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.OrdenesDeCompraEntity;
import com.example.SmallEnter.Repository.OrdenesDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "ordenesDeCompra")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class OrdenesDeCompraController {
    @Autowired
    OrdenesDeCompraRepository ordenesDeCompraRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<OrdenesDeCompraEntity> getAll() {
        return (List<OrdenesDeCompraEntity>) ordenesDeCompraRepository.findAll();
    }

    @GetMapping("/get/{ordenes_de_compra_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<OrdenesDeCompraEntity> findByOrdenesDeCompraId(@PathVariable("ordenes_de_compra_id") Long cuentaId) {
        return ordenesDeCompraRepository.findById(cuentaId);
    }

    @GetMapping("/get/{numero_de_orden}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<OrdenesDeCompraEntity> findByNCF(@PathVariable("numero_de_orden") String numeroOrden) {
        return ordenesDeCompraRepository.findByNumeroOrden(numeroOrden);
    }

    @GetMapping("/get/{suplidor_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<OrdenesDeCompraEntity> findBySuplidorId(@PathVariable("suplidor_id") Long suplidorId) {
        return ordenesDeCompraRepository.findBySuplidorId(suplidorId);
    }
    
    @GetMapping("/ordenesDeCompra/{fecha}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<OrdenesDeCompraEntity> getByFecha(@PathVariable("fecha") Date fechaCreada) {
        return ordenesDeCompraRepository.findByFechaCreada(fechaCreada);
    }

    @GetMapping("/ordenesDeCompra/{status}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<OrdenesDeCompraEntity> findByStatus(@PathVariable("status") boolean statusId) {
        return ordenesDeCompraRepository.findByStatus(statusId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public OrdenesDeCompraEntity save(@RequestBody OrdenesDeCompraEntity ordenesDeCompraEntity) {
        return ordenesDeCompraRepository.save(ordenesDeCompraEntity);
    }
}
