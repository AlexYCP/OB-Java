package modulo.uno.polimorfismo;

// Polimorfismo
// Subclase directa
public class NE_Uno extends NaveEspacial {

    public NE_Uno(String empresa, String nombre) {
        super(empresa, nombre);
    }

    @Override
    public String reutilizacion() {
        return "si";
    }

}
