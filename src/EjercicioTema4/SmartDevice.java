package EjercicioTema4;

public class SmartDevice {

    String marca;
    String color;
    double precio;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
