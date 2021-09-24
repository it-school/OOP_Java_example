package com.vencedor.classes;

public class Ship extends Vehicle{
   private int passengersNumber;
   private String portName;

   public int getPassengersNumber() {
      return passengersNumber;
   }

   public void setPassengersNumber(int passengersNumber) {
      this.passengersNumber = passengersNumber > 0 ? passengersNumber : 1;
   }

   public String getPortName() {
      return portName;
   }

   public void setPortName(String portName) {
      this.portName = portName.strip();
   }

   public Ship(int price, int yearOfProduction, double velocity, int passengersNumber, String portName) {
      super(price, yearOfProduction, velocity);
      this.setPassengersNumber(passengersNumber);
      this.setPortName(portName);
   }

   public Ship(int price, int yearOfProduction, double velocity, int passengersNumber, String portName, Coordinates coordinates) {
      this(price, yearOfProduction, velocity, passengersNumber, portName);
      this.setCoordinates(coordinates);
   }

   public Ship(int price, int yearOfProduction, double velocity, int passengersNumber, String portName, float longitude, float latitude) {
      this(price, yearOfProduction, velocity, passengersNumber, portName, new Coordinates(longitude, latitude));
   }
   @Override
   public String toString() {
      return super.toString() +
              ", passengersNumber=" + passengersNumber +
              ", portName='" + portName + '\'' +
              '}';
   }
/*
   @Override
   public String toString() {
      return "Ship{" +
              "passengersNumber=" + passengersNumber +
              ", portName='" + portName + '\'' +
              ", price=" + price +
              ", yearOfProduction=" + yearOfProduction +
              ", velocity=" + velocity +
              ", coordinates=" + coordinates +
              '}';
   }*/
}
