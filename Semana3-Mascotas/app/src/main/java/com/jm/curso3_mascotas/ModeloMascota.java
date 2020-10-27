package com.jm.curso3_mascotas;

public class ModeloMascota {

    private String nombre;
    private int imagenMascota;

    public ModeloMascota(String nombre, int imagenMascota){
        this.nombre = nombre;
        this.imagenMascota = imagenMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getImagenMascota(){
        return imagenMascota;
    }

    public void setImagenMascota(int imagenMascota) {
        this.imagenMascota = imagenMascota;
    }
}
