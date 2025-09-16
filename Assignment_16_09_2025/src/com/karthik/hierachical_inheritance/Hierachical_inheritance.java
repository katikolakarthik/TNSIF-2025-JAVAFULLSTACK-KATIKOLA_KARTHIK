package com.karthik.hierachical_inheritance;

//Parent class
class Vehicle {
 String brand;
 int speed;

 Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

//Child class 1
class Car extends Vehicle {
 int seats;

 Car(String brand, int speed, int seats) {
     super(brand, speed);
     this.seats = seats;
 }

 void showCarDetails() {
     displayInfo();
     System.out.println("Seats: " + seats);
     System.out.println("Type: Car");
 }
}

//Child class 2
class Bike extends Vehicle {
 String type; // e.g. Sports or Cruiser

 Bike(String brand, int speed, String type) {
     super(brand, speed);
     this.type = type;
 }

 void showBikeDetails() {
     displayInfo();
     System.out.println("Bike Type: " + type);
     System.out.println("Type: Bike");
 }
}

//Main class
public class Hierachical_inheritance {
 public static void main(String[] args) {
     Car car = new Car("Toyota", 180, 5);
     Bike bike = new Bike("Yamaha", 120, "Sports");

     System.out.println("=== Car Details ===");
     car.showCarDetails();

     System.out.println("\n=== Bike Details ===");
     bike.showBikeDetails();
 }
}
