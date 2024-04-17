package Assignments.Assignment1;

public class HouseRunner {
    public static void main(String[] args) {
        //Instantiate the House object in 3 unique ways
        House house1 = new House();
        House house2 = new House("123 Main Ave");
        House house3 = new House("123 Georgian Street", 5, 200000);

        //Output the values of all three instance variables of the 3 House objects
        System.out.printf("House 1: Address = %s%n", house1.address);
        System.out.printf("House 1: Num of Rooms = %d%n", house1.numOfRooms);
        System.out.printf("House 1: Price = %.2f%n%n", house1.price);

        System.out.printf("House 2: Address = %s%n", house2.address);
        System.out.printf("House 2: Num of Rooms = %d%n", house2.numOfRooms);
        System.out.printf("House 2: Price = %.2f%n%n", house2.price);

        System.out.printf("House 3: Address = %s%n", house3.address);
        System.out.printf("House 3: Num of Rooms = %d%n", house3.numOfRooms);
        System.out.printf("House 3: Price = %.2f%n", house3.price);
    }
}
