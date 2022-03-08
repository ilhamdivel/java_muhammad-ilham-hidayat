package Animals.Data;

import Animals.Data.Animals;

public class Carnivor extends Animals {

    public Carnivor(String nama, String jenis, String gigi){
        super(nama, jenis, gigi);
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi I'm Carnivor, My Name is "+super.getNama()+" My Food is '"+ super.getJenis() + "', I Have "+super.getGigi()+" teeth" );
    }
}
