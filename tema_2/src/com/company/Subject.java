package com.company;

public class Subject {
    private Room room;
    private Person teacher;
    private int noOfStudents;

    public Subject(){
    }

    public Subject(Room room, Person teacher, int noOfStudents){
        this.room = room;
        this.teacher = teacher;
        this.noOfStudents = noOfStudents;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public static void main(String[] args) {
        Room room = new Room(1, 1, "A");
        Person teacher = new Person("Nina", "Iulia", "f", 23, 343434);
        Subject subiect = new Subject(room, teacher, 14);

        System.out.println(subiect.getTeacher().getName() + " " + subiect.room.getRoom_type());
    }
}
