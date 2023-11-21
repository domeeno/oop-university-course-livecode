package abstraction.abs;

public abstract class Animal {
  String food;
  int hunger;

  public abstract void makeNoise();

  public abstract void eat();

  public void sleep() {
    System.out.println("Sleeping");
  }
}
