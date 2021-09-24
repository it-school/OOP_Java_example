package com.vencedor.classes;

import java.time.LocalDateTime;

public class Vehicle {
   int price;
   int yearOfProduction;
   double velocity;
   Coordinates coordinates;

   public Vehicle(int price, int yearOfProduction, double velocity) {
      this.setPrice(price);
      this.setYearOfProduction(yearOfProduction);
      this.setVelocity(velocity);
   }

   public Vehicle(int price, int yearOfProduction, double velocity, Coordinates coordinates) {
      this(price, yearOfProduction, velocity);
      this.setCoordinates(coordinates);
   }

   public Vehicle(int price, int yearOfProduction, double velocity, float longitude, float latitude) {
      this(price, yearOfProduction, velocity, new Coordinates(longitude, latitude));
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price > 0 ? price : -1;
   }

   public int getYearOfProduction() {
      return yearOfProduction;
   }

   public void setYearOfProduction(int yearOfProduction) {
      this.yearOfProduction = yearOfProduction <= LocalDateTime.now().getYear() ? yearOfProduction : LocalDateTime.now().getYear();
   }

   public double getVelocity() {
      return velocity;
   }

   public void setVelocity(double velocity) {
      this.velocity = velocity > 0 ? velocity : -1;
   }

   public Coordinates getCoordinates() {
      return coordinates;
   }

   public void setCoordinates(Coordinates coordinates) {
      this.coordinates = coordinates;
   }

   public void setCoordinates(float longitude, float latitude) {
      this.coordinates = new Coordinates(longitude, latitude);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "{" +
              "price=" + (price < 0 ? "incorrect" : price) +
              ", yearOfProduction=" + yearOfProduction +
              ", velocity=" + velocity +
              ", coordinates=" + coordinates +
              '}';
   }

   public void move(Coordinates coordinates) {
      this.setCoordinates(coordinates);
   }

   public void move(int longitude, int latitude) {
      this.setCoordinates(new Coordinates(longitude, latitude));
   }
}
