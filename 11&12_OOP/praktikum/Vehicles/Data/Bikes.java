package Vehicles.Data;

public class Bikes extends Vehicles {
   private int wheel_count;

   public Bikes(String name, int wheel_count, String with_engine){
       super(name, with_engine);
       this.wheel_count = wheel_count;
   }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Bike, My Name is "+super.getName()+" Bikes, My Engine Status is "+"'"+super.getWith_engine()+"'"+ " I have "+ this.wheel_count+ " Wheel(s)");
    }


}
