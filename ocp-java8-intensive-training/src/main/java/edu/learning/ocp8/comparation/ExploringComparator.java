package edu.learning.ocp8.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExploringComparator {

    public static void main(String... args) {
        ArrayList<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));

        Collections.sort(milista,
                (Persona p1,Persona p2)-> p1.getNombre().compareTo(p2.getNombre()));

        Collections.sort(milista,
                (p1, p2)-> p1.getNombre().compareTo(p2.getNombre()));

        Collections.sort(milista,
                (p1, p2)-> {
                    return p1.getNombre().compareTo(p2.getNombre());
                });

        Collections.sort(milista,
                Comparator.comparing(Persona::getNombre));

        milista.sort(Comparator.comparing(Persona::getNombre));


        for (Persona p: milista) {

            System.out.println(p.getNombre());

        }
    }

    static class Persona {

        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Persona(String nombre) {
            super();
            this.nombre = nombre;
        }
    }

}
