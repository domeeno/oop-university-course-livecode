package abstraction;

import abstraction.abs.Animal;

public class VeterinaryClinic {
  public void vaccinate(Animal animal) {
    animal.makeNoise();
    animal.eat();
    animal.sleep();
  }
}
