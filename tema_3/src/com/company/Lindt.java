package com.company;

public class Lindt extends CandyBox{
    private int lenght, width, height;

    public Lindt(){
    }

    public Lindt(int lenght, int width, int height, String flavor, String origin){
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.flavor = flavor;
        this.origin = origin;
    }

    @Override
    public int getVolume(){
        return lenght*width*height;
    }

    @Override
    public String toString() {
        int volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;
    }

    public boolean equals(Lindt a, Lindt b) {
        if(a.flavor.equals(b.flavor) && a.origin.equals(b.origin) && a.getVolume()==b.getVolume())
            return true;
        else return false;
    }
}
