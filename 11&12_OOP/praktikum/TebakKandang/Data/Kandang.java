package TebakKandang.Data;

import java.util.Random;

// membuat class Kandang
public class Kandang {
    //inisialisasi field
    private String[] animalList = {"Kambing","Bebek","Zebra"};
    private String isiKandang;
    private String tampilanKandang;


    //getter dan setter
    public String[] getAnimalList() {
        return animalList;
    }

    public void setAnimalList(String[] animalList) {
        this.animalList = animalList;
    }

    public String getIsiKandang() {
        return isiKandang;
    }

    public void setIsiKandang(String isiKandang) {
        this.isiKandang = isiKandang;
    }

    public String getTampilanKandang() {
        return tampilanKandang;
    }

    public void setTampilanKandang(String tampilanKandang) {
        this.tampilanKandang = tampilanKandang;
    }





    //membuat method random
    private String randomKandang(){
        Random random = new Random();
        return animalList[random.nextInt(3)];
    }

    //membuat constructor
    public Kandang(String index){
        this.tampilanKandang = index;
        this.isiKandang = randomKandang();
    }
}
