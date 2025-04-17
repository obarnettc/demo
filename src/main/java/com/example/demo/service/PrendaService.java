package com.example.demo.service;

import com.example.demo.model.Prenda;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class PrendaService {
    private final List<Prenda> prendas = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    // CREATE
    public Prenda crearPrenda(Prenda prenda) {
        prenda.setId(idGenerator.getAndIncrement());
        prendas.add(prenda);
        return prenda;
    }

    // READ (Todos)
    public List<Prenda> listarPrendas() {
        return new ArrayList<>(prendas);
    }

    // READ (Por ID)
    public Prenda buscarPorId(Long id) {
        return prendas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Prenda no encontrada"));
    }

    // UPDATE
    public Prenda actualizarPrenda(Long id, Prenda prendaActualizada) {
        Prenda prenda = buscarPorId(id);
        prenda.setNombre(prendaActualizada.getNombre());
        prenda.setTalla(prendaActualizada.getTalla());
        prenda.setPrecio(prendaActualizada.getPrecio());
        prenda.setCategoria(prendaActualizada.getCategoria());
        return prenda;
    }

    // DELETE
    public void eliminarPrenda(Long id) {
        Prenda prenda = buscarPorId(id);
        prendas.remove(prenda);
    }

}
