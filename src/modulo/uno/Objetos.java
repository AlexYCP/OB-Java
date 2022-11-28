package modulo.uno;

public class Objetos {

    private String nombre;
    private int edad;

    public Objetos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {

        // Objetos
        // los sig. objetos se pueden visualizar con ayuda del depurador
        Objetos objetos = new Objetos("Yosimar Pineda", 24);
        System.out.println(objetos);

        // manipulación de objetos
        objetos.nombre = "Alexander Pineda";
        objetos.edad = 25;

        System.out.println(objetos);

    }

}
