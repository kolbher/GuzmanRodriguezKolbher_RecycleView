package com.dam.dam_recycleview;

public class Restaurante {
    private String nombre;
    private String ur1photos;
    private float valoracion;
    private String direccion;

    public Restaurante(String nombre, String ur1photos, float valoracion, String direccion) {
        this.nombre = nombre;
        this.ur1photos = ur1photos;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUr1photos() {
        return ur1photos;
    }

    public float getValoracion() {
        return valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUr1photos(String ur1photos) {
        this.ur1photos = ur1photos;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
