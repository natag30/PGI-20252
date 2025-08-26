package co.uniquindio.poo;

import co.uniquindio.poo.model.Cita;
import co.uniquindio.poo.model.Mascota;
import co.uniquindio.poo.model.Propietario;
import co.uniquindio.poo.model.Veterinario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Creamos propietario
        Propietario propietario= new Propietario("Natalia","Garcia", "natalia.garcia1992@gmail.com", 1094975918, 105245623 );
        Propietario propietario1= new Propietario("Andres","Sanchez", "jandressanchez26@gmail.com", 1094965911, 155245623 );

        //Creamos mascota
        Mascota mascota= new Mascota("Kiara", "Criollo", "tricolor", 4, 1, "Gato", propietario);
        Mascota mascota1= new Mascota("Sally", "Pug", "Gris", 6, 2,"Perro", propietario);
        Mascota mascota2= new Mascota("Satoru", "Husky", "Gris", 1, 3,"Perro", propietario1);

        //Creamos veterinario
        Veterinario veterinario=new Veterinario("Jorge Sanchez", "109598796");
        Veterinario veterinario1=new Veterinario("Andrea Martinez", "109592396");

        //Creamos cita
        Cita cita=new Cita( new Date(2025-1900,9,27), "Consultorio 1", 1, veterinario);
        Cita cita2=new Cita( new Date(2025-1900,9,27), "Consultorio 1", 2, veterinario1);
        Cita cita3=new Cita( new Date(2025-1900,9,28), "Consultorio 1", 3, veterinario);

        propietario.asignarCitaPropietario(cita);
        propietario1.asignarCitaPropietario(cita2);
        propietario1.asignarCitaPropietario(cita3);


        System.out.println(cita.toString());
        System.out.println(cita2.toString());
        System.out.println(cita3.toString());

    }
}