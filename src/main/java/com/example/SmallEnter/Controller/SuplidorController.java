package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.SuplidorEntity;
import com.example.SmallEnter.Repository.SuplidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "suplidor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class SuplidorController {
    @Autowired
    SuplidorRepository suplidorRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<SuplidorEntity> getAll() {
        return (List<SuplidorEntity>) suplidorRepository.findAll();
    }

    @GetMapping("/get/{suplidor_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<SuplidorEntity> findBySuplidorId(@PathVariable("suplidor_id") Long suplidorId) {
        return suplidorRepository.findById(suplidorId);
    }

    @GetMapping("/get/{empresa}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<SuplidorEntity> getByEmpresa(@PathVariable("empresa") String empresa) {
        return suplidorRepository.findByEmpresa(empresa);
    }

    @GetMapping("/get/{registro_nacional}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<SuplidorEntity> getByApellido(@PathVariable("registro_nacional") String registroNacional) {
        return suplidorRepository.findByRegistroNacional(registroNacional);
    }
    @GetMapping("/suplidor/{status_suplidor}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<SuplidorEntity> getByStatus(@PathVariable("status_suplidor") boolean statusSuplidor) {
        return suplidorRepository.findByStatusSuplidor(statusSuplidor);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public SuplidorEntity save(@RequestBody SuplidorEntity suplidorEntity) {
        return suplidorRepository.save(suplidorEntity);
    }
}
