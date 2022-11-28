package modulo.uno.herencia;

// Herencia
// Superclase
public class Coche {

    private int ruedas;
    private int puertas;

    public Coche(int ruedas, int puertas) {
        this.ruedas = ruedas;
        this.puertas = puertas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

}
