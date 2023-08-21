package Adventure_Game;

public class Inventory {
    int weaponId;
    String weaponName = "Hands";
    int weaponDamage;
    int weaponPrice;

    int armorId;
    String armorName = "Body";
    int armorProtection;
    int armorPrice;

    Inventory(){
    }

    void createWeapon(String weaponName, int weaponId, int weaponDamage, int weaponPrice){
        this.weaponName = weaponName;
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;

    }

    void createArmor(String armorName, int armorId, int armorProtection, int armorPrice){
        this.armorName = armorName;
        this.armorId = armorId;
        this.armorProtection = armorProtection;
        this.armorPrice = armorPrice;
    }


    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public int getArmorId() {
        return armorId;
    }

    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }

    public int getArmorPrice() {
        return armorPrice;
    }

    public void setArmorPrice(int armorPrice) {
        this.armorPrice = armorPrice;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmorProtection() {
        return armorProtection;
    }

    public void setArmorProtection(int armorProtection) {
        this.armorProtection = armorProtection;
    }
}
