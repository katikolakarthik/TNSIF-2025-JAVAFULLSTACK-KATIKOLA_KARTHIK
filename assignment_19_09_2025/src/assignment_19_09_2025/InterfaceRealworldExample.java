package assignment_19_09_2025;
interface Payment {
 void pay(double amount);
 void refund(double amount);
}
class CreditCardPayment implements Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card.");
 }

 @Override
 public void refund(double amount) {
     System.out.println("Refunded ₹" + amount + " to Credit Card.");
 }
}
class PayPalPayment implements Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using PayPal.");
 }

 @Override
 public void refund(double amount) {
     System.out.println("Refunded ₹" + amount + " to PayPal.");
 }
}
class UpiPayment implements Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI.");
 }

 @Override
 public void refund(double amount) {
     System.out.println("Refunded ₹" + amount + " to UPI account.");
 }
}
public class InterfaceRealworldExample {
 public static void main(String[] args) {
     Payment payment1 = new CreditCardPayment();
     payment1.pay(1500);
     payment1.refund(500);

     Payment payment2 = new PayPalPayment();
     payment2.pay(2000);
     payment2.refund(1000);

     Payment payment3 = new UpiPayment();
     payment3.pay(750);
     payment3.refund(200);
 }
}
