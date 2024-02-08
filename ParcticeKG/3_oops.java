package ParcticeKG;

import java.util.Scanner;

/* 
// properties of the Car
class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }

    public Car start() {
        int pop = 5;
        if (currentFuelInLiters == 0) {
            System.out.println(pop);
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}


*/


// PRACTICE OOPS

/* 

Create a Book class for a library system.
    • Instance variables: title, author, isbn.
    • Static variable: totalBooks, a counter for the total number of book 
    instances.
    • Instance methods: borrowBook(), returnBook().
    • Static method: getTotalBooks(), to get the total number of books in the 
    library

*/

 class Book{
    static int totalBooks = 0;
    String title;
    String author;
    String isbn;
    boolean isborrowed;

    { //Object init
        totalBooks++;
    }

    Book(String title, String author, String isbn){ // parameterixed constructor
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    Book(String isbn){
        this(isbn,"unknown","unknown"); // parameterized  constructor
    }

    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if (isborrowed){
            System.out.println(this.title + " is already borrowed.");
        }
        else{
            System.out.println(this.title + " is borrowed.");
            isborrowed = true;
        }
    }
    void returnBook(){
        if (!isborrowed){
            System.out.println(this.title + " is not borrowed.");
        }
        else{
            System.out.println(this.title + " is returned.");
            isborrowed = false;
        }
    }
 }