package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.RolEntity;
import com.example.SmallEnter.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "rol")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class RolController {
    @Autowired
    RolRepository rolRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<RolEntity> getAll() {
        return (List<RolEntity>) rolRepository.findAll();
    }

    @GetMapping("/get/{rol_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<RolEntity> findByRolId(@PathVariable("rol_id") Long rolId) {
        return rolRepository.findByRolId(rolId);
    }

    @GetMapping("/get/{rol}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<RolEntity> findByNCF(@PathVariable("rol") String rol) {
        return rolRepository.findByRol(rol);
    }

    @GetMapping("/rol/{descripcion}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<RolEntity> getByFecha(@PathVariable("descripcion") String descripcion) {
        return rolRepository.findByDescripcion(descripcion);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public RolEntity save(@RequestBody RolEntity rolEntity) {
        return rolRepository.save(rolEntity);
    }
}