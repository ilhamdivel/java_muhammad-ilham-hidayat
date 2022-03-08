package Animals.Data;

public class Animals {
    private String nama;
    private String jenis;
    private String gigi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getGigi() {
        return gigi;
    }

    public void setGigi(String gigi) {
        this.gigi = gigi;
    }

    public Animals(String nama, String jenis, String gigi){
        this.nama = nama;
        this.jenis = jenis;
        this.gigi = gigi;
    }

    public void identity_myself(){
        System.out.println("Hi I'm Parent of All Animal, My Name is "+nama);
    }


}
