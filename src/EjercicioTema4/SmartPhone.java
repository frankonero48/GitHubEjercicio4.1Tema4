package EjercicioTema4;

public class SmartPhone extends SmartDevice{

    int duracionBater;
    boolean cincoG;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String color, double precio, int duracionBater, boolean cincoG) {
        super(marca, color, precio);
        this.duracionBater = duracionBater;
        this.cincoG = cincoG;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", duracionBater=" + duracionBater +
                ", cincoG=" + cincoG +
                '}';
    }
}
