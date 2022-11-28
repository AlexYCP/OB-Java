package modulo.uno;

public class Clase {

    // Creación de una clase y su estructura:
    // atributos
    private Integer numero;
    private String palabra;

    // constructor
    public Clase(Integer numero, String palabra) {
        this.numero = numero;
        this.palabra = palabra;
    }

    // comportamiento
    // métodos getter y setter
    private void setNumero(Integer numero) {
        this.numero = numero;
    }

    private Integer getNumero() {
        return this.numero;
    }

    private void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    private String getPalabra() {
        return this.palabra;
    }

    public static void main(String[] args) {

        // creo el sig. objeto
        Clase clase = new Clase(0, "");
        clase.setNumero(1);
        clase.setPalabra("Uno");
        System.out.println("Número: " + clase.getNumero()
                + "\n" + "Palabra: " + clase.getPalabra());

    }

}
