/*
* Copyright (c) 2020
*
* The TryCatchPop file adds integer added by the 
* user to the stack array and it pops it off the stack. It also checks
* whether the stack is empty or not and doesn't crash.
* 
* @author  Wajd Mariam
* @version 2.0
* @since   2020/12/10
*/

// Imports Java Classes:
import java.util.Scanner;


class CarMain {
  public static void main(String[] args) {
      
    // Declaring variables used:
    String licensePlateCar = "";
    String carColorUser = "";
    int counter = 0;
    int counter2 = 0;
    int popNumber = 0;
    String licensePlateCar1Change = "";
    String colorCar1Change = "";
    int speedChange = 0;
    
    // Try Catch Statement for catching input error:
    try {
      // Declaring Scanner:
      final Scanner licenseInput = new Scanner(System.in);
      final Scanner colorInput = new Scanner(System.in);
      final Scanner speedInput = new Scanner(System.in);
      
      // Input / Process / Output
      
      // Car #1 
      
      // Getting license plate number for car#1:
      System.out.println("");
      System.out.print("Enter your license plate number of your first car: ");
      licensePlateCar = licenseInput.nextLine();
      
      // Getting car color of the first car:
      System.out.print("Enter the color of your first car: ");
      carColorUser = colorInput.nextLine();
      
      // Printing out the first car's information:
      Vehicles firstCar = new Vehicles(licensePlateCar, carColorUser);
      System.out.println("");
      System.out.println("Here are your first car's information: ");
      System.out.println("License plate #: " + firstCar.licensePlateGetter());
      System.out.println("Car color: " + firstCar.colorGetter());
      
      // Car #2
      
      // Getting license plate number for car#2:
      System.out.println("");
      System.out.print("Enter your license plate number of your second car: ");
      licensePlateCar = licenseInput.nextLine();
      
      // Getting car color of the first car:
      System.out.print("Enter the color of your second car: ");
      carColorUser = colorInput.nextLine();
      
      // Printing out the second car's information:
      Vehicles secondCar = new Vehicles(licensePlateCar, carColorUser);
      System.out.println("");
      System.out.println("Here are your second car's information: ");
      System.out.println("License plate #: " + secondCar.licensePlateGetter());
      System.out.println("Car color: " + secondCar.colorGetter());
      
      // Changing cars information:
      // Changing car#1 licence plate number:
      System.out.println("");
      System.out.println("Your license plate on your first car is outdated. You need a new plate"
                       + " Please enter a valid license plate number:");
      licensePlateCar1Change = licenseInput.nextLine();
      System.out.println("Your new license plate number: " + licensePlateCar1Change);
      // firstCar.licensePlateGetter()
      // Changing car#1 color:
      System.out.println("");
      System.out.println("Your first car's body is rusty. You need a new pain job."
                       + " Please enter a color to paint your car:");
      colorCar1Change = colorInput.nextLine();
      System.out.println("Your new car color: " + colorCar1Change);
      // firstCar.colorGetter()
      // Changing car speeds:
      // Acceleration
      System.out.println("");
      System.out.println("Go take your second car for a test ride");
      System.out.println("How fast do you want to go? in KM/H");
      speedChange = speedInput.nextInt(); 
      // Returning speed:
      System.out.println("Your car is travelling at " 
                         + secondCar.accelerationCalculation(speedChange) + "KM/H");
      
      // Acceleration
      System.out.println("There are traffic up head!");
      System.out.println("SLOW DOWN!");
      System.out.println("How much do you want to decrease your speed? in KM/H");
      speedChange = speedInput.nextInt(); 
      // Returning speed:
      System.out.println("Your car is travelling at "
                         + secondCar.decelerationCalculation(speedChange) + "KM/H");
      
    // Catches and tells the user what error occurred:
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Your car isn't able to do such thing!");
      // Error Catch Statement:
    } catch (Exception e) {
      System.out.print("");
      System.out.println("ERROR."); 
    }
  }
}