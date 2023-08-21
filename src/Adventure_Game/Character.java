package Adventure_Game;

public class Character extends Inventory{
    int charId;
    int charDamage;
    int charHealth;
    int charCoin;


    Character(){
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getCharDamage() {
        return charDamage;
    }

    public void setCharDamage(int charDamage) {
        this.charDamage = charDamage;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }

    public int getCharCoin() {
        return charCoin;
    }

    public void setCharCoin(int charCoin) {
        this.charCoin = charCoin;
    }
}
