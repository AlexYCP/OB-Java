package modulo.uno;

public class ClaseString {

    public static void main(String[] args) {

        // Clase String
        // unos cuantos métodos de la clase String

        // extraer longitud de una cadena de carácteres
        String nombre = "Yosimar Pineda";
        System.out.println(nombre.length());

        // eliminar espacios
        String verbo = "  correr  ";
        System.out.println(verbo.trim());

        // comparar cadenas de carácteres
        String habilidad = "persuasión";
        String resultado = (habilidad.equals("persuasión") ? "true" : "false");
        System.out.println(resultado);

    }

}
