package Adventure_Game;

public class Player extends Character{
    String name;
    Character hero;

    void heroSpecs(){
        System.out.println("Hero's specs: Weapon= "+ hero.weaponName+","+" Power= "+ hero.getCharDamage()+","+" Health= "+ hero.getCharHealth()+","+" Shield= "+ hero.armorName+","+" Protection= "+ hero.getArmorProtection()+","+" Coin= "+hero.getCharCoin());
    }

}
