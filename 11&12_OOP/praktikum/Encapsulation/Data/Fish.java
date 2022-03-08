package Encapsulation.Data;

public class Fish {
    private String type;
    private String feed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public void show_identity(String type, String feed) {
        System.out.println("Saya ikan dengan detail, Jenis: "+this.type+" makanan "+this.feed);
    }
}
