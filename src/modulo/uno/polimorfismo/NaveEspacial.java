package modulo.uno.polimorfismo;

// Polimorfismo
// Superclase
public abstract class NaveEspacial {

    private String empresa;
    private String nombre;

    public NaveEspacial(String empresa, String nombre) {
        this.empresa = empresa;
        this.nombre = nombre;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract String reutilizacion();

}
