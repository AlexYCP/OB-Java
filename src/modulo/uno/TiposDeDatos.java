package modulo.uno;

public class TiposDeDatos {

    public static void main(String[] args) {

        // Tipos de datos primitivos (no pueden asignar valores 'null'):
        // números enteros
        byte numeroUno = 1; // 1 byte
        short numeroDos = 2; // 2 bytes
        int numeroTres = 3; // 3 bytes
        long numeroCuatro = 4; // 4 bytes

        // números de punto flotante
        float numeroCincoPuntoCinco = 5.5f;
        double numeroSeisPuntoSeis = 6.67d;

        // carácteres
        char letra = 'a';
        char numero = '1';

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        // String (aquí involucro una clase)
        String nombre = "Yosimar";
        String apellido = "Pineda";

        // Tipos de datos envoltorio (se pueden asignar valores 'null'):
        Byte numeroSiete = 7;
        Short numeroOcho = 8;
        Integer numeroNueve = 9;
        Long numeroDiez = 10L;
        Float numeroOnce = 11F;
        Double numeroDoce = 12D;

    }

}
