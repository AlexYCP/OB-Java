package modulo.uno.estructura_de_datos;

public class Arreglos {

    public static void main(String[] args) {

        // Arreglos (estructura de datos estática)
        // arreglo de tipo String
        String palabra_1 = "uno",
                palabra_2 = "dos",
                palabra_3 = "tres",
                palabra_4 = "cuatro",
                palabra_5 = "cinco";

        String[] palabras =
                new String[]{palabra_1, palabra_2, palabra_3, palabra_4, palabra_5};

        int[] numeros = new int[5];

        // estructura 'for' mejorada, diseñada para iterar a través de arreglos
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
