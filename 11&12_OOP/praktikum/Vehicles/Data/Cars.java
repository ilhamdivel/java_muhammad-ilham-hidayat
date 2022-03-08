package Vehicles.Data;

public class Cars extends Vehicles {
    private int wheel_count;
    private String engine_type;

    public Cars(String name, int wheel_count, String with_engine, String engine_type){
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Car, My Name is "+super.getName()+" Cars, My Engine Status is "+"'"+super.getWith_engine()+"'"+ " I have "+ this.wheel_count+ " Wheel(s), My Engine Type = "+engine_type);
    }
}
