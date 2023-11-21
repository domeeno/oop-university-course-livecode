package polymorphism.classexample;

public class UltraCar extends Car {
  @Override
  public void start() {
    super.start();
    System.out.println("Flying through the atmosphere");
  }
}
