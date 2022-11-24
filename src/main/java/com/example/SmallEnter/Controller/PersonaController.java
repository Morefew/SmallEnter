package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.PersonaEntity;
import com.example.SmallEnter.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "persona")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaEntity> getAll() {
        return (List<PersonaEntity>) personaRepository.findAll();
    }

    @GetMapping("/get/{persona_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<PersonaEntity> findByPersonaId(@PathVariable("persona_id") Long personaId) {
        return personaRepository.findById(personaId);
    }

    @GetMapping("/get/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<PersonaEntity> getByNombre(@PathVariable("nombre") String nombre) {
        return personaRepository.findByNombre(nombre);
    }

    @GetMapping("/get/{apellido}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<PersonaEntity> getByApellido(@PathVariable("apellido") String apellido) {
        return personaRepository.findByApellido(apellido);
    }
// Como buscar en atributo de una entidad que pertenece a otra
//    @GetMapping("/persona/{rol}")
//    @ResponseStatus(HttpStatus.OK)
//    public Optional<PersonaEntity> getByRol(@PathVariable("rol") String rol) {
//        return personaRepository.findByRol(rol);
//    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public PersonaEntity save(@RequestBody PersonaEntity personaEntity) {
        return personaRepository.save(personaEntity);
    }
}
