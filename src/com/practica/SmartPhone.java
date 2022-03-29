package com.practica;

public class SmartPhone extends SmartDevice{

    boolean tieneCamara;
    boolean instalacionDeProgramas;

    public SmartPhone() {
    }

    public SmartPhone(String nombre, String marca, String sistemaOperativo, boolean conexionABlutooth, boolean tieneCamara, boolean instalacionDeProgramas) {
        super(nombre, marca, sistemaOperativo, conexionABlutooth);
        this.tieneCamara = tieneCamara;
        this.instalacionDeProgramas = instalacionDeProgramas;
    }

    public boolean isTieneCamara() {
        return tieneCamara;
    }

    public void setTieneCamara(boolean tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    public boolean isInstalacionDeProgramas() {
        return instalacionDeProgramas;
    }

    public void setInstalacionDeProgramas(boolean instalacionDeProgramas) {
        this.instalacionDeProgramas = instalacionDeProgramas;
    }
}
