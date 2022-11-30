package modulo.ejercicios;

public class EjercicioCinco {

    public static void main(String[] args) {

        // Ejercicio
        // Robot helicóptero
        Robot rh = new Helicoptero("Helicóptero", "encender");
        System.out.println(rh.toString());

        System.out.println();

        // Robot submarino
        Robot rs = new Submarino("Submarino", "apagar");
        System.out.println(rs.toString());

    }

}

interface Robot {

    // métodos
    // interruptor
    public String getInterruptor();

}

class Propiedades implements Robot {

    // variables de instancia
    private String nombre;
    private String interruptor;

    // constructor
    public Propiedades(String nombre, String interruptor) {
        this.nombre = nombre;
        this.interruptor = interruptor;
    }

    // métodos 'setter' y 'getter'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getInterruptor() {
        return interruptor;
    }

    public void setInterruptor(String interruptor) {
        this.interruptor = interruptor;
    }

    // método 'toString'
    public String toString() {
        return String.format("Nombre del robot: %s\nInterruptor: %s",
                nombre, interruptor);
    }

}

class Helicoptero extends Propiedades {

    public Helicoptero(String nombre, String interruptor) {
        super(nombre, interruptor);
    }

}

class Submarino extends Propiedades {

    public Submarino(String nombre, String interruptor) {
        super(nombre, interruptor);
    }

}