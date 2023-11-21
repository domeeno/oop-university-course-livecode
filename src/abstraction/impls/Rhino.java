package abstraction.impls;

import abstraction.abs.Animal;

public class Rhino extends Animal {
  @Override
  public void makeNoise() {
    System.out.print("noot noot");
  }

  @Override
  public void eat() {

  }
}
