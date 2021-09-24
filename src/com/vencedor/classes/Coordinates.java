package com.vencedor.classes;

public class Coordinates {
   private float longitude;
   private float latitude;

   public float getLongitude() {
      return longitude;
   }

   public void setLongitude(float longitude) {
      this.longitude = longitude;
   }

   public float getLatitude() {
      return latitude;
   }

   public void setLatitude(float latitude) {
      this.latitude = latitude;
   }

   public Coordinates(float longitude, float latitude) {
      this.longitude = longitude;
      this.latitude = latitude;
   }

   @Override
   public String toString() {
      return "(" + longitude + ", " + latitude + ")";
   }
}
