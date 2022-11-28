package modulo.uno;

public class ContinueBreak {

    public static void main(String[] args) {

        // Continue
        int contador = 0;

        while (contador < 10) {
            contador++;
            if (contador == 5) { continue; }
            System.out.print(contador);
        }

        System.out.println();

        // Break
        contador = 0;

        do {
            contador++;
            if (contador == 7) { break; }
            System.out.print(contador);
        } while (contador < 10);

    }

}
