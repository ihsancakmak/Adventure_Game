package Adventure_Game;

public class Character extends Inventory{
    Inventory charWeapon = new Inventory("Hands",0,0,0);
    Inventory charArmor = new Inventory("None",0,0,0);
    String charName ;
    int charId;
    int charDamage;
    int charHealth;
    int charCoin;

    Character(){}

    Character(String charName, int charId, int charDamage, int charHealth, int charCoin){
        this.charName = charName;
        this.charId = charId;
        this.charDamage = charDamage;
        this.charHealth = charHealth;
        this.charCoin = charCoin;
    }
    void charSpecs(Character character){
        System.out.println(character.charName+"'s specs: "+"  Power="+character.getCharDamage()+
                "  Health="+character.getCharHealth()+"  Coin="+character.getCharCoin());
    }

    void printCharacters(){
        String str[][] = {{"Character |", "ID |", "Damage |", "Health |", "Coin"},
                {"-----------", "----", "--------", "--------", "----"},
                {"Samurai   |", "1  |", "  5    |", " 21    |", " 15"},
                {"Archer    |", "2  |", "  7    |", " 18    |", " 20"},
                {"Knight    |", "3  |", "  8    |", " 24    |", " 5"},
        };

        for (String[] strings : str) {
            int j = 0;
            for (j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------------------");
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String name) {
        this.charName = name;
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
