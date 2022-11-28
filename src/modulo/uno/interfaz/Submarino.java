package modulo.uno.interfaz;

public class Submarino implements Robot {

    private String habilidad;
    private int precio;

    public Submarino(String habilidad, int precio) {
        this.habilidad = habilidad;
        this.precio = precio;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return this.habilidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

}
