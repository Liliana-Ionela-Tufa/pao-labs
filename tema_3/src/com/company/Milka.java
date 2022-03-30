package com.company;

public class Milka extends CandyBox{
    private int radius, height;

    public Milka(){
    }
    public Milka(String flavor, String origin, int radius, int height){
        this.flavor = flavor;
        this.origin = origin;
        this.radius = radius;
        this.height = height;
    }

    @Override
    public int getVolume(){
        return 3*radius*radius*height;
    }

    @Override
    public String toString() {
        int volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;
    }
    public boolean equals(Milka a, Milka b) {
        if(a.flavor.equals(b.flavor) && a.origin.equals(b.origin) && a.getVolume()==b.getVolume())
            return true;
        else return false;
    }

}
