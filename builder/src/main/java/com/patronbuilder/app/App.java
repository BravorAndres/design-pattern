package com.patronbuilder.app;

<<<<<<< HEAD
=======
import java.util.function.Function;

import com.patronbuilder.app.Modelo.Persona;
import com.patronbuilder.app.dto.Empleyee;

import lombok.Builder;

>>>>>>> builder
/**
 * Hello world!
 *
 */
public class App 
{
<<<<<<< HEAD
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
=======

    public void modificar(){
        Persona person1 = new Persona(new StringBuilder("Alvar0"), new StringBuilder("Jaramillo"), 23);
        int edadPerson = person1.getEdad();
        edadPerson = 78;
        System.out.println(person1.getEdad());
    }

    public static void main( String[] args )
    {
        Empleyee emp = new Empleyee.EmpleyeeBuilder().setName(new StringBuilder("Andrew Gonzales"))
                                                     .setGender(new StringBuilder("male"))
                                                     .addPhones(new StringBuilder("8687688"), new StringBuilder("8788"), new StringBuilder("Home"))
                                                     .setAge(32).setAdress(new StringBuilder("Aragon 198 int 404"),new StringBuilder("Numenor"), new StringBuilder("Middle earth"),new StringBuilder("083929"))
                                                     .addContacts(new StringBuilder("Legolas"), new StringBuilder("83778 3827"),new StringBuilder("874"), new StringBuilder("Iphon"))
                                                     .addContacts(new StringBuilder("boromir"), new StringBuilder("3099"), new StringBuilder("86767"), new StringBuilder("Andriod"))
                                                     .addPhones(new StringBuilder("7865867"), new StringBuilder("656"), new StringBuilder("Iphone"))
                                                     .build();
        System.out.println(emp.getName());
        System.out.println(emp.getContacts());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAge());
>>>>>>> builder
    }
}
