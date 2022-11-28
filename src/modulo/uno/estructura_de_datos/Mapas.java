package modulo.uno.estructura_de_datos;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        // Mapas (estructura de datos compuesta por una clave y un valor)
        Map<String, Integer> numeros = new HashMap<>();

        numeros.put("Número", 1);
        numeros.put("Número", 2);
        numeros.put("Número", 3);
        numeros.put("Número", 4);

        // obtener claves
        System.out.print("Claves: ");

        for (String clave : numeros.keySet()) {
            System.out.println(clave);
        }

        // obtener valores
        System.out.print("Valores: ");

        for (Integer valores : numeros.values()) {
            System.out.println(valores);
        }

        // obtener pares
        System.out.println("Pares:");

        for (Map.Entry<String, Integer> pares : numeros.entrySet()) {
            System.out.println(
                    "Claves: " + pares.getKey() + ", Valores: " + pares.getValue()
            );
        }

    }

}
