package polymorphism.classexample;

public class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Starting the car");
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating the car");
  }
}
