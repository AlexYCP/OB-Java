package modulo.uno;

public class Funciones {

    // Variable de instancia o campo
    private int numeroUno;

    public Funciones(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    // función diseñada para establecer valores (método 'getter')
    private void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    // función diseñada para devolver valores (método 'setter')
    private int getNumeroUno() {
        return this.numeroUno;
    }

    public static void main(String[] args) {

        // Funciones
        /*
        Ámbito y retorno de funciones:
        private: Otorga acceso y alcance a la clase
        public: Otorga acceso y alcance a todos los paquetes
        protected: Es una combinación de acceso/alcance privado y publico
         */

        // objeto 'numero' de tipo 'Funciones'
        Funciones numero = new Funciones(0);
        numero.setNumeroUno(1);
        System.out.println("Número: " + numero.getNumeroUno());

        // sobrecarga de métodos
        String numeroDosString = numeroDos("Uno");
        System.out.println("Número (tipo de dato String): " + numeroDosString);

        int numeroDosInteger = numeroDos(1);
        System.out.println("Número (tipo de dato Integer): " + numeroDosInteger);

    }

    // sobrecarga de métodos
    private static String numeroDos(String numeroDos) {
        return  numeroDos;
    }
    private static int numeroDos(int numeroDos) {
        return numeroDos;
    }

}
