package com.vencedor.classes;

import java.util.Arrays;

public class Garage {
   Vehicle[] garage;

   public Garage(int number) {
      this.garage = new Vehicle[number];
   }

   public Garage() {
      this.garage = new Vehicle[0];
   }

   public void addTransport(Vehicle transport) {
      garage = Arrays.copyOf(this.garage, this.garage.length + 1);
      garage[garage.length - 1] = transport;
   }

   public void setTransport(int index, Vehicle transport)
   {
      if (index < garage.length)
         garage[index] = transport;
      else
         addTransport(transport);
   }

   public Vehicle getTransport(int index)
   {
      if (index < garage.length)
         return garage[index];
      else
         return null;
   }

   @Override
   public String toString() {
      String result = System.lineSeparator() + "Garage: ";

      for (Vehicle item : this.garage) {
         result += System.lineSeparator() + item;
      }

      return result;
      // return "Garage: " + Arrays.toString(garage);
   }
}
