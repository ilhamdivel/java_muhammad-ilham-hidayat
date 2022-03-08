package Animals.Application;

import Animals.Data.*;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals animals = new Animals("Binatang","","");
        animals.identity_myself();

        System.out.println("");

        animals = new Herbivor("Kambing","tumbuhan","tumpul");
        animals.identity_myself();

        System.out.println("");

        animals = new Omnivor("Ayam","semua","tajam dan tumpul");
        animals.identity_myself();

        System.out.println("");
        animals = new Carnivor("Singa","daging","tajam");
        animals.identity_myself();


    }


}
