package com.company;

import java.util.Objects;

public class Room {
    private int number, room_floor;
    private String room_type;

    public Room(){
    }

    public Room(int number, int room_floor, String room_type){
        this.number = number;
        this.room_floor = room_floor;
        this.room_type = room_type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRoom_floor() {
        return room_floor;
    }

    public void setRoom_floor(int room_floor) {
        this.room_floor = room_floor;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public static void main(String[] args) {
        Room r1 = new Room(1, 1, "A" );
        Room r2 = new Room(2, 2, "B");

        System.out.println(r1.getNumber() + " " + r1.getRoom_type());
        System.out.println(r2.getNumber() + " " + r2.getRoom_type());

    }
    }
