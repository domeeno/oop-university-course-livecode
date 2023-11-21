package abstraction.example.interfaces;

public abstract class Weapon {
  private int hitChance;

  public Weapon(int hitChance) {
    this.hitChance = hitChance;
  }

  protected int getHitChance() {
    return this.hitChance;
  }


  public abstract void attack();
}
