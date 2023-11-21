package inheritance.vehicles;

public class Vehicle {

  private final String manufacturer;
  private final String color;
  private final int yearOfManufacture;
  private final String model;

  public Vehicle(String manufacturer, String color, int yearOfManufacture, String model) {
    this.manufacturer = manufacturer;
    this.color = color;
    this.yearOfManufacture = yearOfManufacture;
    this.model = model;
  }

  public void printDetails() {
    System.out.println("Manufacturer: " + this.manufacturer);
    System.out.println("Color: " + this.color);
    System.out.println("Year of manufacture: " + this.yearOfManufacture);
    System.out.println("Model: " + this.model);
  }
}
