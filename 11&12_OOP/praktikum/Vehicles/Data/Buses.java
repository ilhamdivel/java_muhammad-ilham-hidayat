package Vehicles.Data;

public class Buses extends Vehicles {
    int wheel_count;
    String private_bus;

    public Buses(String name, int wheel_count, String with_engine, String private_bus){
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.private_bus = private_bus;
    }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Buses ["+private_bus +"], My Name is "+super.getName()+", My Engine Status is "+"'"+super.getWith_engine()+"'"+ " I have "+ this.wheel_count+ " Wheel(s)");
    }
}
