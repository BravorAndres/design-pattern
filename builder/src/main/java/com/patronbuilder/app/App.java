package com.patronbuilder.app;

import java.util.function.Function;

import com.patronbuilder.app.Modelo.Persona;

/**
 * Hello world!
 *
 */
public class App 
{

    public void modificar(){
        Persona person1 = new Persona(new StringBuilder("Alvar0"), new StringBuilder("Jaramillo"), 23);
        int edadPerson = person1.getEdad();
        edadPerson = 78;
        System.out.println(person1.getEdad());
    }

    public static void main( String[] args )
    {
        App app = new App();
        app.modificar();
    }
}
