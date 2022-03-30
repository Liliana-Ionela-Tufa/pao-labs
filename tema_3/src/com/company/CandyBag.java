package com.company;


public class CandyBag {
    static CandyBox[] box = new CandyBox[101];
    static int n = 0;

    public CandyBag(){
    }

    public CandyBag(CandyBox box){
        this.box[n] = box;
        n++;
    }

    public void printBox(){
        for(int i=0; i<n; i++)
            System.out.println(box[i].toString());
    }
}
