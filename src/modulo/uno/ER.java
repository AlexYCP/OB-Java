package modulo.uno;

public class ER {

    public static void main(String[] args) {

        // Estructuras de repetición
        int contador = 0;

        // while
        while (contador < 5) {
            contador++;
            System.out.print(contador);
        }

        System.out.println();

        contador = 0;

        // do-while
        do {
            contador++;
            System.out.print(contador);
        } while (contador < 5);

        System.out.println();

        // for
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1);
        }

    }

}
