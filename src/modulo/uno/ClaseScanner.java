package modulo.uno;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        // Clase Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, introduce tu nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ahora, introduce tu edad:");
        int edad = entrada.nextInt();

        System.out.println("¡Muy bien hecho!, tu nombre es " + nombre
        + " y tienes " + edad + " años de edad");

    }

}
