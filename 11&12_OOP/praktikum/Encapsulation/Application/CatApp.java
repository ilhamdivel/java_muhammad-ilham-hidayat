package Encapsulation.Application;

import Encapsulation.Data.Cat;

public class CatApp {
    public static void main(String[] args) {
        var kucing = new Cat();

        kucing.setFur_color("Hitam");
        kucing.setNum_of_leg(4);
        kucing.show_identity(kucing.getFur_color(),kucing.getNum_of_leg());

        kucing.setFur_color("Putih");
        kucing.setNum_of_leg(3);
        kucing.show_identity(kucing.getFur_color(),kucing.getNum_of_leg());

        kucing.setFur_color("Hitam Putih");
        kucing.setNum_of_leg(4);
        kucing.show_identity(kucing.getFur_color(),kucing.getNum_of_leg());

        kucing.setFur_color("Poleng Poleng");
        kucing.setNum_of_leg(3);
        kucing.show_identity(kucing.getFur_color(),kucing.getNum_of_leg());

        kucing.setFur_color("bintik bintik");
        kucing.setNum_of_leg(4);
        kucing.show_identity(kucing.getFur_color(),kucing.getNum_of_leg());


    }
}
