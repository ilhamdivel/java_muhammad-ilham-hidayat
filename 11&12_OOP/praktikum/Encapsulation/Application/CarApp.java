package Encapsulation.Application;

import Encapsulation.Data.Car;

public class CarApp {
    public static void main(String[] args) {
        var mobil = new Car();

        mobil.setType("sedan");
        mobil.setColor("merah");
        mobil.setNum_of_tire(4);
        mobil.show_identity(mobil.getType(), mobil.getColor(), mobil.getNum_of_tire());

        mobil.setType("truk");
        mobil.setColor("hijau");
        mobil.setNum_of_tire(6);
        mobil.show_identity(mobil.getType(), mobil.getColor(), mobil.getNum_of_tire());

        mobil.setType("tronton");
        mobil.setColor("coklat");
        mobil.setNum_of_tire(12);
        mobil.show_identity(mobil.getType(), mobil.getColor(), mobil.getNum_of_tire());

        mobil.setType("angkot");
        mobil.setColor("kuning");
        mobil.setNum_of_tire(4);
        mobil.show_identity(mobil.getType(), mobil.getColor(), mobil.getNum_of_tire());
    }
}
