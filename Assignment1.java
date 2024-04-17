package Assignments.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //call the functions
        task1();
        task4();
    }
    static void task1(){
        Scanner input = new Scanner(System.in);

        //Ask the user how many elements they would like to create
        System.out.println("How many elements would you like to create?");
        int elementAmount = input.nextInt();

        //Create an Object array with that many elements
        Object[] array = new Object[elementAmount];

        for(int i = 0; i < elementAmount; i++) {
            //Ask the user to enter a value for each element of the array
            System.out.printf("\n Enter a value for element %d: ", i + 1);
            int value = input.nextInt();

            if(value == 0) { //convert to bool and store in array
                array[i] = false;
            }else if(value == 1) {
                array[i] = true;
            }else if(value > -128 && value < 128) { //convert to byte and store in array
                array[i] = (byte) value;
            }else if(value > -32768 && value < 32767) { //convert to short and store in array
                array[i] = (short) value;
            }else { //keep as int and store in array
                array[i] = value;
            }
        }
        System.out.println(Arrays.toString(array)); //print contents of array
    }

    static void task2(int[] array2) {
        //Output each element of the array
        for (int j : array2) {
            System.out.println(j);
        }
    }

    static void task3(int[] array3) {
        //Ask user to populate contents of the array
        for (int i = 0; i < array3.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number for the array: ");
            array3[i] = input.nextInt();
        }
    }

    static void task4() {
        Scanner input = new Scanner(System.in);

        //Ask the user for how many elements they want in the array
        System.out.println("How many elements would you like to create?");
        int elementAmount = input.nextInt();

        //Create integer array with that many elements
        int[] array4 = new int[elementAmount];

        //Pass the array to the other tasks
        task3(array4);
        task2(array4);
    }
}

