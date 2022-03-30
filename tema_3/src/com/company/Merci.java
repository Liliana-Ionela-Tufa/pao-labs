package com.company;

public class Merci extends CandyBox {
    private int lenght;

    public Merci(){
    }
    public Merci(int lenght, String flavor, String origin){
        this.lenght = lenght;
        this.flavor = flavor;
        this.origin = origin;
    }

    @Override
    public int getVolume(){
        return lenght*lenght;
    }

    @Override
    public String toString() {
        int volume = getVolume();
        return "The " + origin + " " + flavor + " has volume " + volume;
    }

    public boolean equals(Merci a, Merci b) {
        if(a.flavor.equals(b.flavor) && a.origin.equals(b.origin) && a.getVolume()==b.getVolume())
            return true;
        else return false;
    }
}
