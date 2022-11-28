package modulo.uno;

public class EC {

    public static void main(String[] args) {

        // Estructuras de control
        boolean valor = true;
        int numero = 0;

        // if-else / else-if
        if (valor == true) {
            System.out.println(true);
        } else if (valor == false){
            System.out.println(false);
        } else {
            System.out.println("Error, ingresa un valor booleano");
        }

        // operador ternario
        boolean condicion = (valor == true ? true : false);
        System.out.println(condicion);

        // switch
        switch (numero) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("Ingresa un número del modulos.uno al cuatro");
        }

    }

}
