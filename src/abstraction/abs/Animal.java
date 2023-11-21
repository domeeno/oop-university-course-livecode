package abstraction.abs;

public abstract class Animal {
  public abstract void makeNoise();

  public abstract void eat();

  public void sleep() {
    System.out.println("Sleeping");
  }
}
