package abstraction.impls;

import abstraction.abs.Canine;
import abstraction.abs.Companie;
import abstraction.abs.Feline;
import abstraction.abs.Petable;

public class Cat extends Feline implements Petable, Companie {
  @Override
  public void makeNoise() {

  }

  @Override
  public void eat() {

  }

  @Override
  public void sleep() {
    super.sleep();
  }

  @Override
  public void climbTree() {

  }

  @Override
  public void pet() {
    System.out.println("toarce");
  }
}
