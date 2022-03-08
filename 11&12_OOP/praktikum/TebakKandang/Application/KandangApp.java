package TebakKandang.Application;

import TebakKandang.Data.Kandang;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class KandangApp {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    //membuat list untuk kandang dan animal
    public static List<Kandang> kandangList = new ArrayList<Kandang>();
    public static List<String> animalList = new ArrayList<String>(
            Arrays.asList("K", "B", "Z")
    );
    //membuat scanner
    static Scanner input = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        int n = menu();
        int benar = 0;
        for(int i=0; i<n; i++) {
            Kandang kandang = new Kandang(Integer.toString(i+1));
            kandangList.add(kandang);
        }

        while (benar < n){
            kumpulanKandang();
            if(tebakKandang()){
                benar++;
            }

        }
        kumpulanKandang();
        System.out.println(ANSI_GREEN+"Selamat! Anda menebak semua kandang"+ANSI_RESET);

    }
    // membuat method untuk menampilkan menu
    static int menu(){
        System.out.println("================================");
        System.out.println(ANSI_BLUE+"\tTebak Kandang"+ANSI_RESET);
        System.out.println("================================");
        System.out.println("1. Jumlah Kandang");
        System.out.println("99. Exit");
        System.out.println("================================");
        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();

        System.out.println();
        if(menu!= 1){
            return 0;
        } else{
            System.out.println("Masukan Jumlah kandang");
            int kandang = input.nextInt();
            return kandang;
        }

    }

    //membuat method untuk menampilkan kumpulan kandang
    static void kumpulanKandang(){
        //menampilkan setiap kandang menggunakan foreach
        for(Kandang kandang: kandangList){
            System.out.println("|||");
            System.out.println("|"+kandang.getTampilanKandang()+"|");
            System.out.println("|||");
        }
    }


    //membuat method untuk memlilih kandang dan tebak isinya
    static boolean tebakKandang() {
        //membuat variabel
        int numKandang = -1;
        String tebakHewan;
        System.out.println("Pilih kandang yang ingin dibuka :");

        numKandang = input.nextInt();

        System.out.println();

        //cek kandang yang ingin diinput
        try {
            kandangList.get(numKandang - 1);
        } catch (IndexOutOfBoundsException e) {
            //handle exception
            System.out.println("Invalid");
            return false;
        }
        // menu hewan
        System.out.println("---PILIHAN---");
        System.out.println(ANSI_BLUE+"K"+ANSI_RESET+": Kambing");
        System.out.println(ANSI_YELLOW+"B"+ANSI_RESET+": Bebek");
        System.out.println(ANSI_RED+"Z"+ANSI_RESET+": Zebra");

        //melakukan pengecekan terhadap input yg diterima
        while (true) {
            System.out.print("Masukkan tebakkan : ");
            tebakHewan = input.next();
            System.out.println();
            //invalid selain K,B,Z
            if (animalList.contains(tebakHewan)) {
                break;
            } else {
                System.out.println("Input tidak valid");
                System.out.println();
            }
        }
            return mencobaMenebak(numKandang, tebakHewan);
    }

    static boolean mencobaMenebak(int numKandang, String tebakHewan){
        //variabel yang digunakan untuk menampung nama hewan
        String namaTebakHewan ="";

        //convert alfabet to kata
        switch (tebakHewan){
            case "K":
                tebakHewan = ANSI_BLUE+"K"+ANSI_RESET;
                namaTebakHewan = "Kambing";
                break;
            case "B":
                tebakHewan = ANSI_YELLOW+"B"+ANSI_RESET;
                namaTebakHewan = "Bebek";
                break;
            case "Z":
                tebakHewan = ANSI_RED+"Z"+ANSI_RESET;
                namaTebakHewan = "Zebra";
                break;
            default :
                break;
        }

        System.out.println("Percobaan Buka :");
        kandangList.get(numKandang-1).setTampilanKandang(tebakHewan);
        kumpulanKandang();

        //cek isi kandang dengan tebakan user
        if(namaTebakHewan.equals(kandangList.get(numKandang-1).getIsiKandang())){
            System.out.println(ANSI_GREEN+"Tebakan Benar!"+ANSI_RESET);
            return true;
        } else {
            System.out.println(ANSI_YELLOW+"Tebakan Salah"+ANSI_RESET);
            kandangList.get(numKandang-1).setTampilanKandang(Integer.toString(numKandang));
            return false;
        }
    }
}



