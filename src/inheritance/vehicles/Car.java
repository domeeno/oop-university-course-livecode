package inheritance.vehicles;

public class Car extends Vehicle {
  public Car(
      String manufacturer, String color,
      int yearOfManufacture, String model,
      FuelType fuelType, float size) {
    super(manufacturer, color, yearOfManufacture, model);
  }

  public void carDetails() { }
}
