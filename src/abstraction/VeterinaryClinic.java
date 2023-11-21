package abstraction;

import abstraction.abs.Animal;
import abstraction.impls.Cat;
import abstraction.impls.Dog;

public class VeterinaryClinic {
  public void vaccinate(Animal animal) {
    animal.makeNoise();
    animal.eat();
    animal.sleep();
  }
}
