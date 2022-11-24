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

    @GetMapping("/get/{suplidor_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> findBySuplidorId(@PathVariable("suplidor_id") Long suplidorId) {
        return cuentasPorPagarRepository.findBySuplidorId(suplidorId);
    }

    @GetMapping("/cuentasPorPagar/{status_cuenta}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CuentasPorPagarEntity> getByStatus(@PathVariable("status_cuenta") boolean statusCuenta) {
        return cuentasPorPagarRepository.findByStatusCuenta(statusCuenta);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public CuentasPorPagarEntity save(@RequestBody CuentasPorPagarEntity cuentasPorPagarEntity) {
        return cuentasPorPagarRepository.save(cuentasPorPagarEntity);
    }
}
