package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.CuentasPorPagarEntity;
import com.example.SmallEnter.Repository.CuentasPorPagarRepository;
import com.example.SmallEnter.Repository.SuplidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "cuentasPorPagar")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class CuentasPorPagarController {
    @Autowired
    CuentasPorPagarRepository cuentasPorPagarRepository;

    @Autowired
    SuplidorRepository suplidorRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<CuentasPorPagarEntity> getAll() {
        return (List<CuentasPorPagarEntity>) cuentasPorPagarRepository.findAll();
    }

    @GetMapping("/get/{cuentasPorPagar_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> findByCuentasPorPagarId(@PathVariable("cuentasPorPagar_id") Long cuentaId) {
        return cuentasPorPagarRepository.findById(cuentaId);
    }

    @GetMapping("/get/{NCF}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> findByNCF(@PathVariable("NCF") String ncf) {
        return cuentasPorPagarRepository.findByNCF(ncf);
    }

    @GetMapping("/get/{suplidor_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> findBySuplidorId(@PathVariable("suplidor_id") Long suplidorId) {
        return cuentasPorPagarRepository.findBySuplidorId(suplidorId);
    }
    
    @GetMapping("/cuentasPorPagar/{fecha}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> getByFecha(@PathVariable("fecha") Date fechaCreada) {
        return cuentasPorPagarRepository.findByFechaCreada(fechaCreada);
    }

    @GetMapping("/cuentasPorPagar/{pagada}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> getByPersonaId(@PathVariable("pagada") boolean pagadaId) {
        return cuentasPorPagarRepository.findByPagada(pagadaId);
    }
    @GetMapping("/cuentasPorPagar/{status}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> getByStatus(@PathVariable("status") boolean status) {
        return cuentasPorPagarRepository.findByStatus(status);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public CuentasPorPagarEntity save(@RequestBody CuentasPorPagarEntity cuentasPorPagarEntity) {
        return cuentasPorPagarRepository.save(cuentasPorPagarEntity);
    }
}
