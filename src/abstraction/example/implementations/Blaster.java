package abstraction.example.implementations;

import abstraction.example.interfaces.Weapon;

public class Blaster extends Weapon {

  public Blaster(int hitChance) {
    super(hitChance);
  }

  @Override
  public void attack() {
    System.out.println("shoot " + super.getHitChance() + "/10");
  }
}
