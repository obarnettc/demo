package com.example.demo.model;


public class Prenda {
    private Long id;
    private String nombre;
    private String talla;  // Ej: "S", "M", "L"
    private double precio;
    private String categoria; // Ej: "Camisa", "Pantalón"

    public Prenda() {
    }

    public Prenda(Long id, String nombre, String talla, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
