package Adventure_Game;

public class Player extends Character{

    int health;
    int coin;
    String name;
    Character hero;
    int location;
    int damage;

    public void playerSpecs(Player player){
        System.out.println(player.name+"'s specs: "+ "Power="+player.getDamage()+ "  Health="+player.getHealth()+
                "  Weapon="+player.hero.charWeapon.getInventoryName()+ "  Armor="+player.hero.charArmor.getInventoryName()+
                "  Protection="+player.hero.charArmor.inventoryPower+ "  Coin="+player.getCoin());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(Character hero, Inventory weapon) {
        this.damage = hero.getCharDamage() + weapon.getInventoryPower();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(Character hero) {
        this.health = hero.getCharHealth();
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
