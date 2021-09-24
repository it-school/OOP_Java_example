package com.vencedor.classes;

public class Plane extends Vehicle {
   public static final int MIN_HEIGHT = 200;
   public static final int MAX_HEIGHT = 15000;
   public static final int DEFAULT_HEIGHT = 1000;

   private int passengersNumber;
   private int maxHeight;

   public Plane(int price, int yearOfProduction, double velocity, int passengersNumber, int maxHeight) {
      super(price, yearOfProduction, velocity);
      this.setPassengersNumber(passengersNumber);
      this.setMaxHeight(maxHeight);
   }

   public Plane(int price, int yearOfProduction, double velocity, int passengersNumber, int maxHeight, Coordinates coordinates) {
      this(price, yearOfProduction, velocity, passengersNumber, maxHeight);
      this.setCoordinates(coordinates);
   }

   public Plane(int price, int yearOfProduction, double velocity, int passengersNumber, int maxHeight, float longitude, float latitude) {
      this(price, yearOfProduction, velocity, passengersNumber, maxHeight, new Coordinates(longitude, latitude));
   }

   public int getMaxHeight() {
      return maxHeight;
   }

   public void setMaxHeight(int maxHeight) {
      this.maxHeight = maxHeight > MIN_HEIGHT && maxHeight < MAX_HEIGHT ? maxHeight : DEFAULT_HEIGHT;
   }

   public int getPassengersNumber() {
      return passengersNumber;
   }

   public void setPassengersNumber(int passengersNumber) {
      this.passengersNumber = passengersNumber > 0 ? passengersNumber : 1;
   }

   @Override
   public String toString() {
      return super.toString() +
              ", passengersNumber=" + passengersNumber +
              ", max height='" + maxHeight + '\'' +
              '}';
   }
}