package modulo.uno.polimorfismo;

// Polimorfismo
// Subclase directa
public class NE_Dos extends NaveEspacial {

    public NE_Dos(String empresa, String nombre) {
        super(empresa, nombre);
    }

    @Override
    public String reutilizacion() {
        return "no";
    }

}
