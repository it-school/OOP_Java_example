package com.vencedor;

import com.vencedor.classes.Garage;
import com.vencedor.classes.Plane;
import com.vencedor.classes.Ship;
import com.vencedor.classes.Vehicle;

public class Main {

   public static void main(String[] args) {
      Vehicle vehicle = new Vehicle(-100000, 2024, 100, 46, 30);
      System.out.println(vehicle);

      Ship ship = new Ship(500000, 2019, 30, 10, "Odessa", 30, 46);
      System.out.println(ship);

      Plane plane = new Plane(200000, 2016, 1000, 100, 5000, 31, 46);
      System.out.println(plane);

      Garage garage = new Garage();
      garage.addTransport(ship);
      garage.addTransport(plane);

      System.out.println(garage);

      garage.getTransport(0).move(0, 0);
      System.out.println(garage);
   }
}
