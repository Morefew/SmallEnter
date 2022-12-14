package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.FacturaEntity;
import com.example.SmallEnter.Model.PersonaEntity;
import com.example.SmallEnter.Repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "factura")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class FacturaController {
    @Autowired
    FacturaRepository facturaRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<FacturaEntity> getAll(){
        return (List<FacturaEntity>) facturaRepository.findAll();
    }

    @GetMapping("/factura/{numero_comprobante_fiscal}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<FacturaEntity> getByNCF(@PathVariable("numero_comprobante_fiscal") String numerocomprobantefiscal){
        return facturaRepository.findByNumeroComprobanteFiscal(numerocomprobantefiscal);
    }

    @GetMapping("/factura/{fecha}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<FacturaEntity> getByFecha(@PathVariable("fecha") Date fechaCreada) {
        return facturaRepository.findByFechaCreada(fechaCreada);
    }
//
//    @GetMapping("/factura/{persona}")
//    @ResponseStatus(HttpStatus.OK)
//    public Optional<FacturaEntity> getByPersonaId(@PathVariable("persona") Long personaId) {
//        return facturaRepository.findByPersonaId(PersonaEntity);
//    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public FacturaEntity save(@RequestBody FacturaEntity facturaEntity){
        return facturaRepository.save(facturaEntity);
    }
}
