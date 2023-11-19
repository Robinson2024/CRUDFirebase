package com.example.crudfirebase;

public class MainModel {
    String Nombre, Apellido, email, imgUrl;

    public MainModel() {
    }

    public MainModel(String nombre, String apellido, String email, String imgUrl) {
        Nombre = nombre;
        Apellido = apellido;
        this.email = email;
        this.imgUrl = imgUrl;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}