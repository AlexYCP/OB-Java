package modulo.ejercicios;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class EjercicioSeis {

    public static void main(String[] args) {

        // Ejercicios

        // ejercicio uno
        System.out.println("Ejercicio uno:");
        String getReverse = reverse("Literal de cadena");
        System.out.println(getReverse);

        // ejercicio dos
        System.out.println("Ejercicio dos:");
        arregloUnidimensional();

        // ejercicio tres
        System.out.println("\nEjercicio tres:");
        arregloBidimensional();

        // ejercicio cuatro
        System.out.println("Ejercicio cuatro:");
        vector();

        // ejercicio cinco
        System.out.println("Ejercicio cinco:\n" +
                "El problema de trabajar con 'vectores' es que se crea el doble" +
                "de capacidad de los elementos a guardar.");

        // ejercicio seis
        System.out.println("Ejercicio seis:");
        copiarValores();

        // ejercicio siete
        System.out.println("\nEjercicio siete:");
        moldearLista();

        // ejercicio ocho
        System.out.println("\nEjercicio ocho:");
        try {
            System.out.println(divisionPorCero(1));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // ejercicio nueve
        System.out.println("Ejercicio nueve:");
        copiarArchivo();

        // ejercicio diez
        System.out.println("Ejercicio diez:");
        copiarFichero();

        HashMap<String,Integer> ficheroUno = new HashMap<>();
        HashMap<String,Integer> ficheroDos = new HashMap<>();

        ficheroUno.put("archivo_uno", 1);
        ficheroDos.put("archivo_dos", 2);

        System.out.println(ficheroUno.keySet() + " " + ficheroUno.values() + ":");
        leerFicheroUno();
        System.out.println(ficheroDos.keySet() + " " + ficheroDos.values() + ":");
        leerFicheroDos();

    }

    // ejercicio uno

    public static String reverse(String literalDeCadena) {
        String literalDeCadenaInvertida = "";

        for (int i = (literalDeCadena.length() - 1); i >= 0; i--) {
            literalDeCadenaInvertida += literalDeCadena.charAt(i);
        }

        return literalDeCadenaInvertida;
    }

    // ejercicio dos
    public static void arregloUnidimensional() {
        String[] numeros = {"uno", "dos", "tres", "cuatro", "cinco"};

        for (String numero : numeros) {
            if (numero == "cinco") {
                System.out.print(numero);
            } else {
                System.out.print(numero + ", ");
            }
        }
    }

    // ejercicio tres
    public static void arregloBidimensional() {
        int[][] numeros = {
                {1, 2, 3, 4},
                {-1, -2, -3, -4}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("Fila[%d], Columna[%d], Valor: %d\n",
                        i, j, numeros[i][j]);
            }
        }
    }

    // ejercicio cuatro
    public static void vector() {
        Vector<Integer> numeros = new Vector<>();
        int contador = 0;

        while (contador < 5) {
            numeros.add(contador + 1);
            contador++;
        }

        numeros.remove(1);
        numeros.remove(1);

        System.out.println(numeros);
    }

    // ejercicio seis
    public static void copiarValores() {
        List<String> numerosAL = new ArrayList<>();

        numerosAL.add("uno");
        numerosAL.add("dos");
        numerosAL.add("tres");
        numerosAL.add("cuatro");

        System.out.println("ArrayList:");
        numerosAL.forEach((elemento) ->
                System.out.print((elemento.equals("cuatro")) ? elemento : (elemento + ", ")));

        List<String> numerosLL = new LinkedList<>();
        numerosLL = numerosAL;

        System.out.println("\nLinkedList:");
        numerosLL.forEach((elemento) ->
                System.out.print((elemento.equals("cuatro")) ? elemento : (elemento + ", ")));
    }

    // ejercicio siete
    public static void moldearLista() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int contador = 0;

        while (contador != 10) {
            contador++;
            if ((contador % 2 == 0)) { continue; }
            numeros.add(contador);
        }

        numeros.forEach((elemento) ->
                System.out.print((elemento != 9) ? (elemento + ", ") : elemento));
    }

    // ejercicio ocho
    public static int divisionPorCero(int numero) throws ArithmeticException {
        int division = 0 / numero;
        if (division == 0) {
            throw new
                    ArithmeticException("Un número de tipo entero no puede dividirse entre cero");
        }
        return division;
    }

    // ejercicio nueve
    public static void copiarArchivo() {
        try {
            InputStream archivoIS =
                    new FileInputStream("/home/alex/Documentos/IdeaProjects/Java/src/archivo/archivo_uno.txt");
            byte[] datos = archivoIS.readAllBytes();
            PrintStream archivoPS = new PrintStream("/home/alex/Documentos/IdeaProjects/Java/src/archivo/archivo_dos.txt");
            archivoPS.write(datos);

            System.out.println("Archivo copiado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // ejercicio diez
    public static void copiarFichero() {
        try {
            InputStream ficheroIS =
                    new FileInputStream("/home/alex/Documentos/IdeaProjects/Java/src/fichero/fichero_uno.txt");
            byte[] datos = ficheroIS.readAllBytes();
            PrintStream ficheroPS = new PrintStream("/home/alex/Documentos/IdeaProjects/Java/src/fichero/fichero_dos.txt");
            ficheroPS.write(datos);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void leerFicheroUno() {
        try {
            InputStream ficheroFIS =
                    new FileInputStream("/home/alex/Documentos/IdeaProjects/Java/src/fichero/fichero_uno.txt");
            BufferedInputStream ficheroBIS = new BufferedInputStream(ficheroFIS);

            try {
                int dato = ficheroBIS.read();

                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBIS.read();
                }

                ficheroBIS.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void leerFicheroDos() {
        try {
            InputStream ficheroFIS =
                    new FileInputStream("/home/alex/Documentos/IdeaProjects/Java/src/fichero/fichero_uno.txt");
            BufferedInputStream ficheroBIS = new BufferedInputStream(ficheroFIS);

            try {
                int dato = ficheroBIS.read();

                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBIS.read();
                }

                ficheroBIS.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
