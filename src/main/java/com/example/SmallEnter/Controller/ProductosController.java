package com.example.SmallEnter.Controller;

import com.example.SmallEnter.Model.ProductosEntity;
import com.example.SmallEnter.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "productos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class ProductosController {
    @Autowired
    ProductosRepository productosRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductosEntity> getAll() {
        return (List<ProductosEntity>) productosRepository.findAll();
    }

    @GetMapping("/get/{productos_id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> findByProductosId(@PathVariable("productos_id") Long productoId) {
        return productosRepository.findByProductoId(productoId);
    }

    @GetMapping("/get/{descripcion}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> getByDescripcion(@PathVariable("descripcion") String descripcion) {
        return productosRepository.findByDescripcion(descripcion);
    }

    @GetMapping("/get/{referencia}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> getByReferencia(@PathVariable("referencia") String referencia) {
        return productosRepository.findByReferencia(referencia);
    }
    
    @GetMapping("/productos/{marca}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> getByMarca(@PathVariable("marca") String marca) {
        return productosRepository.findByMarca(marca);
    }

    @GetMapping("/productos/{modelo}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> getByModelo(@PathVariable("modelo") String modelo) {
        return productosRepository.findByModelo(modelo);
    }

    @GetMapping("/productos/{version}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductosEntity> getByVersion(@PathVariable("version") String version) {
        return productosRepository.findByVersion(version);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public ProductosEntity save(@RequestBody ProductosEntity productosEntity) {
        return productosRepository.save(productosEntity);
    }
}
