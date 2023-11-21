package abstraction.example.implementations;

import abstraction.example.interfaces.Weapon;

public class ShockBaton extends Weapon {

  public ShockBaton(int hitChance) {
    super(hitChance);
  }

  @Override
  public void attack() {
    System.out.println("shoot " + super.getHitChance() + "/10");
  }
}
