package com.patronbuilder.app.Modelo;



public class Persona {
    private StringBuilder Nombre;
    private StringBuilder Apellido;
    private int edad;

    public Persona (StringBuilder Nombre,StringBuilder Apellido,int edad){
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
}
