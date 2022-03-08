package Abstraction.Application;

import Abstraction.Data.*;

import java.util.Scanner;

public class KalkulatorApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("+++++++++Calculator+++++++++");
        System.out.println("1. Open Calculator");
        System.out.println("99. Exit");
        System.out.print("Masukan Pilihan anda : ");
        option = input.nextInt();

        if(option == 1) {
            System.out.println("+++++++++Calculator+++++++++");
            System.out.println("1. Add Value");
            System.out.println("2. Sub Value");
            System.out.println("3. Multiply Value");
            System.out.println("4. Divide Value");
            System.out.print("Pilihan anda : ");
            option = input.nextInt();
            if(option == 1){
                Kalkulator kalkulator = new Jumlah();
                System.out.print("Masukan Value 1 : ");
                kalkulator.bil1 = input.nextInt();
                System.out.print("Masukan Value 2 : ");
                kalkulator.bil2 = input.nextInt();
                kalkulator.perhitungan();
            }else if( option == 2) {
                Kalkulator kalkulator = new Kurang();
                System.out.print("Masukan Value 1 : ");
                kalkulator.bil1 = input.nextInt();
                System.out.print("Masukan Value 2 : ");
                kalkulator.bil2 = input.nextInt();
                kalkulator.perhitungan();
            }else if(option == 3) {
                Kalkulator kalkulator = new Kali();
                System.out.print("Masukan Value 1 : ");
                kalkulator.bil1 = input.nextInt();
                System.out.print("Masukan Value 2 : ");
                kalkulator.bil2 = input.nextInt();
                kalkulator.perhitungan();
            }else if(option == 4) {
                Kalkulator kalkulator = new Bagi();
                System.out.print("Masukan Value 1 : ");
                kalkulator.bil1 = input.nextInt();
                System.out.print("Masukan Value 2 : ");
                kalkulator.bil2 = input.nextInt();
                kalkulator.perhitungan();
            }
        }

    }
}
