package modulo.uno;

public class Constructores {

    // variables de instancia o campos
    private String palabra;
    private Integer numero;

    // constructores sobrecargados
    public Constructores(String palabra) {
        this.palabra = palabra;
    }

    public Constructores(Integer numero) {
        this.numero = numero;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return this.palabra;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public static void main(String[] args) {

        // Constructores
        Constructores constructorUno = new Constructores("");
        constructorUno.setPalabra("Uno");
        Constructores constructorDos = new Constructores(0);
        constructorDos.setNumero(1);
        System.out.println("Palabra (tipo de dato String): " + constructorUno.getPalabra());
        System.out.println("Número (tipo de dato Integer): " + constructorDos.getNumero());

    }

}
