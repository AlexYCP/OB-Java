package modulo.uno.interfaz;

public class Resultado {

    public static void main(String[] args) {

        // Resultado
        System.out.println("Robots:");

        System.out.println("\nSubmarino:");
        Submarino submarino = new Submarino("", 0);
        submarino.setHabilidad("Sumergirse en el agua");
        submarino.setPrecio(2800);
        System.out.println("Habilidad: " + submarino.getHabilidad());
        System.out.println("Precio: $" + submarino.getPrecio());

        System.out.println("\nHelicoptero:");
        Helicoptero helicoptero = new Helicoptero("", 0);
        helicoptero.setHabilidad("Volar en el cielo");
        helicoptero.setPrecio(1700);
        System.out.println("Habilidad: " + helicoptero.getHabilidad());
        System.out.println("Precio: $" + helicoptero.getPrecio());

    }

}
