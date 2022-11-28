package modulo.uno.estructura_de_datos;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        // Listas (estructura de datos dinámica)
        // interfaz lista
        List<String> nombres = new ArrayList<>();

        nombres.add("Rocky");
        nombres.add("María");
        nombres.add("Agustín");
        nombres.add("Yosimar");

        System.out.println(nombres);

        // estructura for mejorada
        for(String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

    }

}
