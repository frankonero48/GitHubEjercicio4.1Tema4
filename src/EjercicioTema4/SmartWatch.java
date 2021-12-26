package EjercicioTema4;

public class SmartWatch extends SmartDevice{

    Boolean sumergible;
    int añoFabri;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String color, double precio, Boolean sumergible, int añoFabri) {
        super(marca, color, precio);
        this.sumergible = sumergible;
        this.añoFabri = añoFabri;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", sumergible=" + sumergible +
                ", añoFabri=" + añoFabri +
                '}';
    }
}
