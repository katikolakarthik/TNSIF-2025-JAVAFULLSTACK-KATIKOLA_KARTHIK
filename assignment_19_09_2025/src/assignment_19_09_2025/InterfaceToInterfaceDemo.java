package assignment_19_09_2025;

//Parent interface
interface Vehicle {
 void start();
 void stop();
}

//Child interface extending parent
interface Car extends Vehicle {
 void accelerate();
 void brake();
}

//Class implementing child interface
class ElectricCar implements Car {
 @Override
 public void start() {
     System.out.println("Electric Car started silently.");
 }

 @Override
 public void stop() {
     System.out.println("Electric Car stopped.");
 }

 @Override
 public void accelerate() {
     System.out.println("Electric Car is accelerating using electric motor.");
 }

 @Override
 public void brake() {
     System.out.println("Electric Car is braking with regenerative system.");
 }
}

//Main class
public class InterfaceToInterfaceDemo {
 public static void main(String[] args) {
     Car myCar = new ElectricCar();  // Reference of Car interface

     myCar.start();
     myCar.accelerate();
     myCar.brake();
     myCar.stop();
 }
}
