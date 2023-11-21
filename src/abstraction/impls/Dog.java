package abstraction.impls;

import abstraction.abs.Canine;
import abstraction.abs.Petable;

public class Dog extends Canine implements Petable {
  @Override
  public void makeNoise() {
    System.out.println("Woof!");
  }

  @Override
  public void eat() {

  }

  @Override
  public void roam() {

  }

  @Override
  public void pet() {
    System.out.println("tipy taps");
  }
}
