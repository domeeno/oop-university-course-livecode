package abstraction.example.implementations;

import abstraction.example.interfaces.Trooper;
import abstraction.example.interfaces.Weapon;

public class StormTrooper implements Trooper {

  private final Weapon weapon;

  public StormTrooper(Weapon weapon) {
    System.out.println("I am a storm trooper");
    this.weapon = weapon;
  }

  @Override
  public void move(Long x, Long y) {
    System.out.println("Moves 1 unit");
  }

  @Override
  public void attackRebel(Long y) {
    weapon.attack();
  }
}

