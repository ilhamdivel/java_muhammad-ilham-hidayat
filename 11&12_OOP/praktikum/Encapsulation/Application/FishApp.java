package Encapsulation.Application;

import Encapsulation.Data.Fish;

public class FishApp {
    public static void main(String[] args) {
        var ikan = new Fish();

        ikan.setType("paus");
        ikan.setFeed("plankton");
        ikan.show_identity(ikan.getType(),ikan.getFeed());

        ikan.setType("cupang");
        ikan.setFeed("cacing");
        ikan.show_identity(ikan.getType(),ikan.getFeed());

        ikan.setType("arwana");
        ikan.setFeed("jangkrik");
        ikan.show_identity(ikan.getType(),ikan.getFeed());

        ikan.setType("sapu-sapu");
        ikan.setFeed("pelet");
        ikan.show_identity(ikan.getType(),ikan.getFeed());
    }
}
