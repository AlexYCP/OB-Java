package modulo.ejercicios;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        // Ejercicio
        // Calcular el precio más IVA de un determinado producto.
        String resultado = calcularPrecio();
        System.out.println(resultado);

    }

    public static String calcularPrecio() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Hola, introduce el precio del producto: ");
        double precio = entrada.nextDouble();

        double precioFinal = precio - (precio * 0.015);

        return String.format("Muy bien, el precio del producto más IVA es de: $%.2f",
                precioFinal);
    }

}
