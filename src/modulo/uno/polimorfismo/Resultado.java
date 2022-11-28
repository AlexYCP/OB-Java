package modulo.uno.polimorfismo;

public class Resultado {

    public static void main(String[] args) {

        // Resultado
        System.out.println("Naves espaciales:");

        NE_Uno neu = new NE_Uno("", "");
        neu.setEmpresa("Space X");
        neu.setNombre("Falcon 9");
        System.out.println("\nEmpresa: " + neu.getEmpresa());
        System.out.println("Nombre: " + neu.getNombre());
        System.out.println("¿Es reutilizable?: " + neu.reutilizacion());

        NE_Dos ned = new NE_Dos("", "");
        ned.setEmpresa("Blue Origin");
        ned.setNombre("Shepard");
        System.out.println("\nEmpresa: " + ned.getEmpresa());
        System.out.println("Nombre: " + ned.getNombre());
        System.out.println("¿Es reutilizable?: " + ned.reutilizacion());

    }

}
