package modulo.uno.excepciones;

public class TryCatch {

    public static void main(String[] args) {

        // TryCatch
        try {
            int expresion = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("La ejecución terminó");

    }

}
