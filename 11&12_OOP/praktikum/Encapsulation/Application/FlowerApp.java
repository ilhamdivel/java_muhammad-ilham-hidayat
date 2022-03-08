package Encapsulation.Application;

import Encapsulation.Data.Flower;

public class FlowerApp {
    public static void main(String[] args) {
        var bunga = new Flower();

        bunga.setNama("bangkai");
        bunga.setColor("merah");
        bunga.setNum_of_petal(12);
        bunga.show_identity(bunga.getNama(), bunga.getColor(), bunga.getNum_of_petal());

        bunga.setNama("anggrek");
        bunga.setColor("putih");
        bunga.setNum_of_petal(8);
        bunga.show_identity(bunga.getNama(), bunga.getColor(), bunga.getNum_of_petal());

        bunga.setNama("mawar");
        bunga.setColor("merah");
        bunga.setNum_of_petal(3);
        bunga.show_identity(bunga.getNama(), bunga.getColor(), bunga.getNum_of_petal());

        bunga.setNama("melati");
        bunga.setColor("kuning");
        bunga.setNum_of_petal(5);
        bunga.show_identity(bunga.getNama(), bunga.getColor(), bunga.getNum_of_petal());
    }
}
