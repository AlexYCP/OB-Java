package modulo.uno.sobreescritura;

public class Resultado extends Numero {

    public Resultado(int numero) {
        super(numero);
    }

    @Override
    public void setNumero(int numero) {
        int duplicarNumero = numero * 2;
        super.setNumero(duplicarNumero);
    }

    public static void main(String[] args) {

        // Resultado
        Resultado resultado = new Resultado(0);
        resultado.setNumero(1);
        System.out.println("Número: " + resultado.getNumero());

    }

}
