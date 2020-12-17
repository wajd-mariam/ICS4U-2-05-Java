/*
* Copyright (c) 2020
*
* The WajdStack1 Class creates a stack to use 
* by the TryCatchPop.java program, and has different methods to process.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/15
*/


public class Vehicles {
  
  // Creating Fields
  private String licensePlate;
  private String color;
  private int numOfDoors;
  private int speed;
  private int maxSpeed;

  /**
   * Constructor
   */  
  public Vehicles(String licensePlateInput, String colorInput) {
    this.licensePlate = licensePlateInput;
    this.color = colorInput;
    this.numOfDoors = 4;
    this.speed = 0;
    this.maxSpeed = 240;
  }
  
  /**
   * Setter for license plate combination.
   */
  public void licensePlateSetter(String inputLicensePlate) {
    licensePlate = inputLicensePlate;
  }
  
  /**
   * Getters for license plate combination.
   */
  public String licensePlateGetter() {
    return licensePlate;
  }
  
  /**
   * Setter for color.
   */
  public void colorSetter(String carColorUser) {
    color = carColorUser;
  }
  
  /**
   * Getters for color.
   */
  public String colorGetter() {
    return color;
  }
  
  /**
   * Method that calculates the car speed while accelerating.
   */ 
  public int accelerationCalculation(int speedIncrease) throws Exception {
    // 
    if ((this.speed + speedIncrease) > this.maxSpeed) {
      throw null;
    } else {
      this.speed = this.speed + speedIncrease;
    } 
    return this.speed;
  }
  
  /**
   * Method that calculates the car speed while deceleration.
   */ 
  public int decreaseCalculation(int speedDecrease) throws Exception {
    // 
    if ((this.speed - speedDecrease) < 0) {
      throw null;
    } else {
      this.speed = this.speed - speedDecrease; 
    } 
    return this.speed;
  }
}
