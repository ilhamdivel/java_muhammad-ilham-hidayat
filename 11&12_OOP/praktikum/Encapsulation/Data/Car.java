package Encapsulation.Data;

public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_tire() {
        return num_of_tire;
    }

    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }

    public void show_identity(String type, String color, int num_of_tire){
        System.out.println("Saya mobil dengan detail, Type:"+this.type+" color: "+this.color+" num of tire: "+ this.num_of_tire);
    }
}
