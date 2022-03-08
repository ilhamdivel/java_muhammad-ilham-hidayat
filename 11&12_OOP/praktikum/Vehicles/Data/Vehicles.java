package Vehicles.Data;

public class Vehicles {
    private String name;
    private String with_engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWith_engine() {
        return with_engine;
    }

    public void setWith_engine(String with_engine) {
        this.with_engine = with_engine;
    }

    public Vehicles(String name, String with_engine) {
        this.name = name;
        this.with_engine =  with_engine;
    }

    public void identify_myself(){
        System.out.println("Hi I'm Parent off All Vehicles, My Name is "+name+", My Engine Status "+with_engine);
    }
}
