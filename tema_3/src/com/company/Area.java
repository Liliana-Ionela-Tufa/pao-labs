package com.company;

public class Area {
    private CandyBag list;
    private int number;
    private String street;

    public Area(){
    }

    public Area(CandyBag list, int number, String street){
        this.list = list;
        this.number = number;
        this.street = street;
    }

    public void printAddress(){
        System.out.println("Street " + street + " Number " + number);
        list.printBox();
    }

    public static void main(String[] args) {
        CandyBox a = new Lindt(14, 4, 50, "sweet","idk" );
        CandyBox b = new Merci(10, "sour", "da");
        CandyBox c = new Milka("ahah", "nu", 5, 4);

        CandyBag list = new CandyBag(a);
        list = new CandyBag(b);
        list = new CandyBag(c);

        Area area = new Area(list, 3, "Hehe");

        area.printAddress();
    }
}
