package modulo.ejercicios;

public class EjercicioCuatro {

    public static void main(String[] args) {

        // Ejercicio
        // SmartPhone
        SmartPhone sm = new SmartPhone("Smartphone", "Android", true,
                true, 4700, "Honor");
        System.out.println(sm.toString());

        System.out.println();

        // SmartWatch
        SmartWatch sw = new SmartWatch("Smartwatch", "Android", true,
                true, 1700, "Huawei");
        System.out.println(sw.toString());

    }

}

// Superclase
class SmartDevice {

    // propiedades
    private String dispositivoInteligente;
    private String sistemaOperativo;
    private boolean bluetooth;
    private boolean wifi;
    private int bateria;
    private String fabricante;

    // constructor
    public SmartDevice(String dispositivoInteligente, String sistemaOperativo, boolean bluetooth,
                       boolean wifi, int bateria, String fabricante) {
        this.dispositivoInteligente = dispositivoInteligente;
        this.sistemaOperativo = sistemaOperativo;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.bateria = bateria;
        this.fabricante = fabricante;
    }

    // métodos 'getter' y 'setter'
    // dispositivo inteligente
    public String getDispositivoInteligente() {
        return dispositivoInteligente;
    }

    public void setDispositivoInteligente(String dispositivoInteligente) {
        this.dispositivoInteligente = dispositivoInteligente;
    }

    // sistema operativo
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    // bluetooth
    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    // wifi
    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    // batería
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // fabricante
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // método 'toString'
    @Override
    public String toString() {
        return String.format("Dispositivo inteligente: %s" +
                "\nSistema operativo: %s" +
                "\nBluetooth: %b" +
                "\nWifi: %b" +
                "\nBatería: %dmAh" +
                "\nFabricante: %s",
                dispositivoInteligente,
                sistemaOperativo,
                bluetooth,
                wifi,
                bateria,
                fabricante);
    }

}

// Subclase directa
class SmartPhone extends SmartDevice {

    public SmartPhone(String dispositivoInteligente, String sistemaOperativo, boolean bluetooth,
                      boolean wifi, int bateria, String fabricante) {
        super(dispositivoInteligente, sistemaOperativo, bluetooth, wifi, bateria, fabricante);
    }

}

// Subclase directa
class SmartWatch extends SmartDevice {

    public SmartWatch(String dispositivoInteligente, String sistemaOperativo, boolean bluetooth,
                      boolean wifi, int bateria, String fabricante) {
        super(dispositivoInteligente, sistemaOperativo, bluetooth, wifi, bateria, fabricante);
    }

}
