package abstraction.example;

import abstraction.example.implementations.Blaster;
import abstraction.example.implementations.ShockTrooper;
import abstraction.example.implementations.StormTrooper;
import abstraction.example.interfaces.Trooper;
import abstraction.example.interfaces.Weapon;

public class TrooperMain {


  public static void main(String[] args) {
    Weapon blaster = new Blaster(5);
    Weapon strongerBlaster = new Blaster(10);

    Trooper troop1 = new ShockTrooper(blaster);
    troop1.attackRebel(2L);
    Trooper troop2 = new StormTrooper(strongerBlaster);
    troop2.attackRebel(3L);
    Trooper troop3 = new ShockTrooper(strongerBlaster);
    troop3.attackRebel(3L);
  }
}
