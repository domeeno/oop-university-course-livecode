package polymorphism.classexample;

public class Bicycle implements Vehicle {

  @Override
  public void accelerate() {
    System.out.println("Accelerating the bicycle");
  }

  @Override
  public void start() {
    System.out.println("Starting the bicycle");
  }
}
