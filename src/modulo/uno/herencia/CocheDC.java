package modulo.uno.herencia;

// Herencia
// Subclase directa
public class CocheDC extends Coche {

    private String motor;

    public CocheDC(int ruedas, int puertas, String motor) {
        super(ruedas, puertas);
        this.motor = motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }

}
