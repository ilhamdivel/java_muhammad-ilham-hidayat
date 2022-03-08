package Vehicles.Application;

import Vehicles.Data.Bikes;
import Vehicles.Data.Buses;
import Vehicles.Data.Cars;
import Vehicles.Data.Vehicles;

public class VehiclesApp {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("Gerobak", "no engine");
        vehicles.identify_myself();

        System.out.println("");

        vehicles = new Bikes("Pedal Bikes",2,"no engine");
        vehicles.identify_myself();
        vehicles = new Bikes("Motor Bikes",2,"with engine");
        vehicles.identify_myself();

        System.out.println("");

        vehicles = new Cars("Sport",4,"with engine","V8");
        vehicles.identify_myself();
        vehicles = new Cars("Pickup",4,"with engine","Solar");
        vehicles.identify_myself();

        System.out.println("");
        vehicles = new Buses("Trans Jakarta", 4,"with_engine","Public Bus");
        vehicles.identify_myself();
        vehicles = new Buses("School Bus", 4,"with_engine","Private Bus");
        vehicles.identify_myself();


    }
}



//        vehicles = new Bikes("Pedal Bikes");
//        vehicles.identify_myself("a","a");
//        vehicles.identify_myself("Motor Bikes", "with engine");

//        vehicles = new Cars();
//        vehicles.identify_myself("Sport Cars", "with engine");
//        vehicles.identify_myself("Pickup Cars", "with engine");
//
//        vehicles = new Buses();
//        vehicles.identify_myself("Trans Jakarta", "with engine");
//        vehicles.identify_myself("School Bus", "with engine");

