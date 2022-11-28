package modulo.uno.interfaz;

public class Helicoptero implements Robot {

    private String habilidad;
    private int precio;

    public Helicoptero(String habilidad, int precio) {
        this.habilidad = habilidad;
        this.precio = precio;
    }

    @Override
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return this.habilidad;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

}
