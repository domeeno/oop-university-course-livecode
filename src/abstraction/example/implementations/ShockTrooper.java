package abstraction.example.implementations;

import abstraction.example.interfaces.Trooper;
import abstraction.example.interfaces.Weapon;

public class ShockTrooper implements Trooper {
  private final Weapon weapon;

  public ShockTrooper(Weapon weapon) {
    System.out.println("I am a shock trooper");
    this.weapon = weapon;
  }

  @Override
  public void move(Long x, Long y) {
    System.out.println("Moves 0.5 units");
  }

  @Override
  public void attackRebel(Long y) {
    this.weapon.attack();
  }
}
