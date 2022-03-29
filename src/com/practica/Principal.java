package com.practica;

public class Principal {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch("Xiaomi Mi Watch", "Xiaomi", "Android Wear", true, true, true);
        SmartPhone smartPhone = new SmartPhone("11T Pro", "Xiaomi", "MIUI 12.5 basado en Android 11", true, true, true);

        System.out.println("Caracteristicas de un SmarWatch:"
                + "\nNombre: " + smartWatch.getNombre()
                + "\nMarca: " + smartWatch.getMarca()
                + "\nSistema Operativo: " + smartWatch.getSistemaOperativo()
                + "\n¿Tiene conexion a Bluetooth? " + smartWatch.isConexionABlutooth()
                + "\n¿Tiene podometro? " + smartWatch.isTienePodometro()
                + "\n¿Monitorea el sueño? " + smartWatch.isMonitoreaElsueño());
        System.out.println("");
        System.out.println("Caracteristicas de un SmarPhone:"
                + "\nNombre: " + smartPhone.getNombre()
                + "\nMarca: " + smartPhone.getMarca()
                + "\nSistema Operativo: " + smartPhone.getSistemaOperativo()
                + "\n¿Tiene conexion a Bluetooth? " + smartPhone.isConexionABlutooth()
                + "\n¿Tiene camara? " + smartPhone.isTieneCamara()
                + "\n¿Se le pueden instalar aplicaciones de terceros? " +smartPhone.isInstalacionDeProgramas() );
    }
}
