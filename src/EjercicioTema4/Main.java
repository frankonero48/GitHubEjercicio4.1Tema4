package EjercicioTema4;

public class Main {

    public static void main(String[] args) {

        SmartDevice obj1=new SmartDevice("Sony","Rojo",450);
        SmartPhone obj2=new SmartPhone("Apple","Blanco",1000, 24,true);
        SmartWatch obj3=new SmartWatch("Philips","Negro",120,true,2020);


        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println(obj1.color);
        System.out.println(obj2.marca);
        System.out.println(obj3.añoFabri);
    }
}
