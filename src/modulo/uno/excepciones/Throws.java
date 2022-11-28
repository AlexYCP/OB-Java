package modulo.uno.excepciones;

public class Throws {

    public static void main(String[] args) {

        // Throws, throw
        /*
        try {
            leerCadenasDeCaracteres();
        } catch (NameFomatException e) {
            e.printStackTrace;
        }
         */

    }

    /**
     * Método que lee cadenas de carácteres y verifica que tengan una longitud mayor o
     * igual a siete carácteres.
     * @throws NameFormatException
     */

    /*
    private static void leerCadenasDeCaracteres() throws NameFormatException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de carácteres:");

        while (entrada.hasNext()) {
            System.out.println("Introduce una cadena de carácteres:");
            String cdc = entrada.nextLine();
            if (cdc.length() < 7) {
                entrada.close();
                throw new NameFormatException(
                        "La cadena de carácteres debe de contener mínimo siete carácteres"
                );
            }
        }
        entrada.close();

    }
     */

}

/*
class NameFormatException extends Exception {
    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }

}
 */
