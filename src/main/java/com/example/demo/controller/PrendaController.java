package com.example.demo.controller;

import com.example.demo.model.Prenda;
import com.example.demo.service.PrendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/prendas")
public class PrendaController {
    @Autowired
    private PrendaService prendaService;
    @PostMapping()
    public ResponseEntity<Prenda> crearPrenda(@RequestBody Prenda prenda) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(prendaService.crearPrenda(prenda));
    }
    @GetMapping
    public List<Prenda> listarPrendas() {
        return prendaService.listarPrendas();
    }
    @GetMapping("/{id}")
    public Prenda buscarPorId(@PathVariable Long id) {
        return prendaService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Prenda actualizarPrenda(@PathVariable Long id, @RequestBody Prenda prenda) {
        return prendaService.actualizarPrenda(id, prenda);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrenda(@PathVariable Long id) {
        prendaService.eliminarPrenda(id);
        return ResponseEntity.noContent().build();
    }
}
