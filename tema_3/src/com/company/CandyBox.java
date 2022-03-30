package com.company;

public abstract class CandyBox{
    protected String flavor, origin;

    public CandyBox(){
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract int getVolume();

    @Override
    public String toString(){
        return flavor + " " + origin;
    }
}
