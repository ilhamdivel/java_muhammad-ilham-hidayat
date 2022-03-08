package Encapsulation.Data;

public class Flower {
    private String nama;
    private String color;
    private int num_of_petal;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_petal() {
        return num_of_petal;
    }

    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }

    public void show_identity(String nama, String color, int num_of_petal){
        System.out.println("Saya bunga dengan detail, Jenis: "+this.nama+" color: "+color+" num of petal: "+num_of_petal);
    }

}
