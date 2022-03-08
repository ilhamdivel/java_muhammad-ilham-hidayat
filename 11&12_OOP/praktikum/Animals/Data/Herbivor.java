package Animals.Data;

import Animals.Data.Animals;

public class Herbivor extends Animals {

    public Herbivor(String nama, String jenis, String gigi){
        super(nama, jenis, gigi);
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi I'm Herbivor, My Name is "+super.getNama()+" My Food is "+ super.getJenis() + ", I Have "+super.getGigi()+" teeth" );
    }

}
