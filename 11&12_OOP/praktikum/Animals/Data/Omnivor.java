package Animals.Data;

import Animals.Data.Animals;

public class Omnivor extends Animals {


    public Omnivor(String nama, String jenis, String gigi){
        super(nama, jenis, gigi);
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi I'm Omnivor, My Name is "+super.getNama()+" My Food is '"+ super.getJenis() + "', I Have "+super.getGigi()+" teeth" );
    }
}
