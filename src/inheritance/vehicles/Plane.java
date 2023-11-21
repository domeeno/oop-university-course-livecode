package inheritance.vehicles;

public class Plane extends Vehicle {
  private final int numberOfEngines;

  public Plane(String manufacturer, String color, int yearOfManufacture, String model, int numberOfEngines) {
    super(manufacturer, color, yearOfManufacture, model);
    this.numberOfEngines = numberOfEngines;
  }

  public void printDetails() {
    super.printDetails();
    System.out.println("Engines" + this.numberOfEngines);
  }
}
