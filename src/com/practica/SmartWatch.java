package com.practica;

public class SmartWatch extends SmartDevice{

    boolean tienePodometro;
    boolean monitoreaElsueño;

    public SmartWatch() {
    }

    public SmartWatch(String nombre, String marca, String sistemaOperativo, boolean conexionABlutooth, boolean tienePodometro, boolean monitoreaElsueño) {
        super(nombre, marca, sistemaOperativo, conexionABlutooth);
        this.tienePodometro = tienePodometro;
        this.monitoreaElsueño = monitoreaElsueño;
    }

    public boolean isTienePodometro() {
        return tienePodometro;
    }

    public void setTienePodometro(boolean tienePodometro) {
        this.tienePodometro = tienePodometro;
    }

    public boolean isMonitoreaElsueño() {
        return monitoreaElsueño;
    }

    public void setMonitoreaElsueño(boolean monitoreaElsueño) {
        this.monitoreaElsueño = monitoreaElsueño;
    }
}
