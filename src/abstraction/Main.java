package abstraction;

import abstraction.abs.Animal;
import abstraction.impls.Cat;
import abstraction.impls.Dog;
import abstraction.impls.Rhino;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    VeterinaryClinic clinic = new VeterinaryClinic();

    List<Animal> animals;
    animals = Arrays.asList(new Dog(), new Cat(), new Rhino());

    animals.forEach(clinic::vaccinate);

    Dog dog1 = new Dog();
    Animal dog = new Dog();

  }
}
