package modulo.uno.herencia;

public class Resultado {

    public static void main(String[] args) {

        // Resultado
        // CocheDC (coche de combustión)
        CocheDC cdc = new CocheDC(0, 0, "");
        cdc.setRuedas(4);
        cdc.setPuertas(4);
        cdc.setMotor("combustión");
        System.out.println("Submarino de combustión:");
        System.out.println("Ruedas: " + cdc.getRuedas());
        System.out.println("Puertas: " + cdc.getPuertas());
        System.out.println("Motor: " + cdc.getMotor());

        // Submarino de electricidad
        CocheDE cde = new CocheDE(0, 0, "");
        cde.setRuedas(4);
        cde.setPuertas(4);
        cde.setMotor("eléctrico");
        System.out.println("\nSubmarino de electricidad:");
        System.out.println("Ruedas: " + cde.getRuedas());
        System.out.println("Puertas: " + cde.getPuertas());
        System.out.println("Motor: " + cde.getMotor());

    }

}
