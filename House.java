package Assignments.Assignment1;

public class House {
    //Create 3 instance variables with unique data types and accessibility
    String address;
    protected int numOfRooms;
    public double price;

    //Create 7 constructors for this class
    public House(){}
    public House(String address) {
        this.address = address;
    }
    public House(int numOfRooms5) {
        this.numOfRooms = numOfRooms5;
    }
    public House(double price) {
        this.price = price;
    }
    public House(String address, int numOfRooms) {
        this.address = address;
        this.numOfRooms = numOfRooms;
    }

    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }
    public House(String address, int numOfRooms, double price) {
        this.address = address;
        this.numOfRooms = numOfRooms;
        this.price = price;
    }
}
