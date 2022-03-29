package com.practica;

public class SmartDevice {

    String nombre;
    String marca;
    String sistemaOperativo;
    boolean conexionABlutooth;

    public SmartDevice() {
    }

    public SmartDevice(String nombre, String marca, String sistemaOperativo, boolean conexionABlutooth) {
        this.nombre = nombre;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.conexionABlutooth = conexionABlutooth;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isConexionABlutooth() {
        return conexionABlutooth;
    }

    public void setConexionABlutooth(boolean conexionABlutooth) {
        this.conexionABlutooth = conexionABlutooth;
    }
}
