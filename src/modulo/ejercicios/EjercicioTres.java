package modulo.ejercicios;

public class EjercicioTres {

    public static void main(String[] args) {

        // Ejercicio
        String[] numeros = {"uno", "dos", "tres", "cuatro", "cinco"};

        System.out.print("Números: ");

        for (String numero : numeros) {
            if (numero.equals("cinco")) {
                System.out.print(numero);
            } else {
                System.out.print(numero + ", ");
            }
        }

    }

}
