package Adventure_Game;

public class Inventory {

    String inventoryName;
    int inventoryId;
    int inventoryPower = 0;
    int inventoryPrice;


    Inventory(){
    }
    Inventory(String inventoryName, int inventoryId, int inventoryPower, int inventoryPrice){
        this.inventoryName = inventoryName;
        this.inventoryId = inventoryId;
        this.inventoryPower = inventoryPower;
        this.inventoryPrice = inventoryPrice;
    }
    void printWeapons() {
        String str1[][] = {{"Weapon |", "ID |", "Damage |", "Coin"},
                {"-----------", "----", "--------", "--------"},
                {"Pistol   |", "1  |", "  2    |", " 25    |"},
                {"Sword    |", "2  |", "  3    |", " 35    |"},
                {"Rifle    |", "3  |", "  7    |", " 45    |"},
        };


        for (String[] strings : str1) {
            int j = 0;
            for (j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------------------");
    }
    void printArmors(){
        String str2[][] = {{"Armor |", "ID |", "Protection |", "Coin"},
                {"-----------", "----", "--------", "--------"},
                {"Soft Leather  |", "1  |", "  1    |", " 15    |"},
                {"Hard Leather  |", "2  |", "  3    |", " 25    |"},
                {"Full Plate    |", "3  |", "  5    |", " 40    |"},
        };


        for (String[] strings : str2) {
            int j = 0;
            for (j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------------------");
    }
    boolean buyInventory(Player player, Inventory inventory){
        if(player.getCoin() < inventory.inventoryPrice){
            System.out.println("You don't have enough coin!");
            return false;
        }
        if(player.hero.charWeapon.inventoryName.equals(inventory.inventoryName) || player.hero.charArmor.inventoryName.equals(inventory.inventoryName)){
            System.out.println("You already have the same item!");
            return false;
        }
        else player.coin = player.getCoin() - inventory.inventoryPrice;

        return true;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public int getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(int inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public int getInventoryPower() {
        return inventoryPower;
    }

    public void setInventoryPower(int inventoryPower) {
        this.inventoryPower = inventoryPower;
    }
}
