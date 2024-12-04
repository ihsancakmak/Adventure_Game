package Adventure_Game;
import javax.swing.plaf.ScrollPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Game extends Character{
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    Player player;

    Game(){
    }
    void printMap(){
        System.out.println();
        System.out.println("########## MAP ##########");
        System.out.println();
        System.out.println("1- Safe House ---> This place is safe and will renews your health.");
        System.out.println("2- Tool Store ---> You can buy weapon or armor.");
        System.out.println("3- Cave ---> Be careful! You may encounter zombies.");
        System.out.println("4- Forest ---> Be careful! You may encounter vampires.");
        System.out.println("5- River ---> Be careful! You may encounter bears.");
        System.out.println("0- Quit ---> Quit game.");
        System.out.println("Please choose where you want to go.");
    }
    Character selectHero(){
        printCharacters();




        System.out.println("Your player name: "+ player.name);
        boolean isValid = false;
        while(!isValid){
            System.out.print("Please choose your character by writing its id number:");
            if(in.hasNextInt()){
                int chosenId = in.nextInt();
                if(chosenId <= 3 && chosenId >= 1) {
                    switch (chosenId) {
                        case 1 -> {
                            player.hero = new Character("Samurai", 1, 5, 21, 15);
                            System.out.println(player.name + " is a Samurai");

                            player.setCharId(1);
                            player.setDamage(player.hero, player.hero.charWeapon);
                            player.setHealth(player.hero);
                            player.setCoin(player.hero.getCharCoin());
                            player.playerSpecs(player);

                        }
                        case 2 -> {
                            player.hero = new Character("Archer", 2, 7, 18, 20);
                            System.out.println(player.name + " is a Archer");

                            player.setCharId(2);
                            player.setDamage(player.hero, player.hero.charWeapon);
                            player.setHealth(player.hero);
                            player.setCoin(player.hero.getCharCoin());
                            player.playerSpecs(player);

                        }
                        case 3 -> {
                            player.hero = new Character("Knight", 3, 8, 24, 5);
                            System.out.println(player.name + " is a Knight");

                            player.setCharId(3);
                            player.setDamage(player.hero, player.hero.charWeapon);
                            player.setHealth(player.hero);
                            player.setCoin(player.hero.getCharCoin());
                            player.playerSpecs(player);
                        }
                    }
                    isValid = true;
                }
                else System.out.println("Invalid range. Please enter a number between 1 and 3.");


            }
            else System.out.println("Invalid input.");
            in.nextLine();

        }

        return player.hero;
    }
    void toolStore(){
        System.out.println("-----Welcome to Tool Store-----");
        System.out.println();
        //player.heroSpecs(player);

        boolean isValid = false;
        while(!isValid) {
            System.out.println("Please type '1' for Weapons, '2' for Armors");
            System.out.println("Please type '0' to return back");

            if(in.hasNextInt()) {
                int chosenInventory = in.nextInt();
                if(chosenInventory >= 0 && chosenInventory <= 2){
                    switch (chosenInventory) {
                        case 0 -> {
                            playerLocation();
                        }
                        case 1 -> {
                            printWeapons();
                            Inventory weapon1 = new Inventory("Pistol", 1, 2, 25);
                            Inventory weapon2 = new Inventory("Sword", 2, 3, 35);
                            Inventory weapon3 = new Inventory("Rifle", 3, 7, 45);

                            boolean isValidAgain = false;
                            while (!isValidAgain){
                                System.out.println("Please type the ID number of the product you want to buy.");
                                System.out.println("Please type '0' to return back.");

                                if(in.hasNextInt()){
                                    int chosenWeaponId = in.nextInt();
                                    if(chosenWeaponId >= 0 && chosenWeaponId <=3){
                                        switch (chosenWeaponId) {
                                            case 0 -> {
                                                toolStore();
                                            }

                                            case 1 -> {
                                                if (buyInventory(player, weapon1)) {
                                                    player.hero.charWeapon = weapon1;
                                                    System.out.println("You bought a " + weapon1.inventoryName);
                                                }
                                                player.setDamage(player.hero, player.hero.charWeapon);
                                                player.playerSpecs(player);
                                            }

                                            case 2 -> {
                                                if (buyInventory(player, weapon2)) {
                                                    player.hero.charWeapon = weapon2;
                                                    System.out.println("You bought a " + weapon2.inventoryName);
                                                }
                                                player.setDamage(player.hero, player.hero.charWeapon);
                                                player.playerSpecs(player);
                                            }

                                            case 3 -> {
                                                if (buyInventory(player, weapon3)) {
                                                    player.hero.charWeapon = weapon3;
                                                    System.out.println("You bought a " + weapon3.inventoryName);
                                                }
                                                player.setDamage(player.hero, player.hero.charWeapon);
                                                player.playerSpecs(player);
                                            }
                                        }
                                    }
                                    else System.out.println("Invalid range. Please enter a number between 0 and 3.");
                                }
                                else System.out.println("Invalid input.");
                                in.nextLine();
                            }
                            toolStore();

                        }
                        case 2 -> {
                            printArmors();
                            Inventory armor1 = new Inventory("Soft Leather", 1, 1, 15);
                            Inventory armor2 = new Inventory("Hard Leather", 2, 3, 25);
                            Inventory armor3 = new Inventory("Full Plate", 3, 5, 40);

                            boolean isValidAgain = false;
                            while (!isValidAgain) {
                                System.out.println("Please type the ID number of the product you want to buy.");
                                System.out.println("Please type '0' to return back.");

                                if (in.hasNextInt()) {
                                    int chosenArmorId = in.nextInt();
                                    if (chosenArmorId >= 0 && chosenArmorId <= 3) {
                                        switch (chosenArmorId) {
                                            case 0 -> {
                                                toolStore();
                                            }
                                            case 1 -> {
                                                if (buyInventory(player, armor1)) {
                                                    player.hero.charArmor = armor1;
                                                    System.out.println("You bought a " + armor1.inventoryName);
                                                }

                                                player.playerSpecs(player);
                                            }
                                            case 2 -> {
                                                if (buyInventory(player, armor2)) {
                                                    player.hero.charArmor = armor2;
                                                    System.out.println("You bought a " + armor2.inventoryName);
                                                }

                                                player.playerSpecs(player);

                                            }
                                            case 3 -> {
                                                if (buyInventory(player, armor3)) {
                                                    player.hero.charArmor = armor3;
                                                    System.out.println("You bought a " + armor3.inventoryName);
                                                }

                                                player.playerSpecs(player);
                                            }
                                        }
                                    }
                                    else System.out.println("Invalid range. Please enter a number between 0 and 3.");
                                }
                                else System.out.println("Invalid input.");
                                in.nextLine();
                            }
                            toolStore();
                        }

                    }
                }
                else System.out.println("Invalid range. Please enter a number between 0 and 2.");
            }
            else System.out.println("Invalid input.");
            in.nextLine();
        }

    }
    int numberOfMonsters(){

        return random.nextInt(3) + 1;
    }
    void fight(Player player, Character monster){
        int whoStarts = random.nextInt(2) + 1;
        if(whoStarts == 1){
            System.out.println();
            System.out.println("!!!!!!!!!! "+player.name+" starts the attack !!!!!!!!!!");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("!!!!!!!!!! " + monster.charName + " starts the attack !!!!!!!!!!");
            System.out.println();
        }
        while(player.health > 0 && monster.charHealth > 0){


            player.playerSpecs(player);
            monster.charSpecs(monster);
            if(whoStarts == 1) {
                monster.charHealth = monster.charHealth - player.damage;
                whoStarts = 2;
            }
            if(monster.charHealth < 1){
                System.out.println("You killed the "+monster.getCharName()+" !!!");
                player.coin += monster.getCharCoin();
                player.playerSpecs(player);
                break;
            }
            if(whoStarts == 2){
                if(monster.charDamage - player.hero.charArmor.inventoryPower >= 0) {
                    player.health = player.health - (monster.charDamage - player.hero.charArmor.inventoryPower);
                    whoStarts = 1;
                }
            }
            if(player.getHealth() < 1){
                System.out.println("You died!!!");
                System.out.println("!!!!!The Game is Over!!!!!");
                System.out.println("Do you want to play again?(y/n)");
                String again = in.next();
                if(again.equals("y")){
                    gameStart();
                    break;
                }
                else System.exit(0);

            }

        }

    }
    public void playerLocation() {
        printMap();

        Scanner in = new Scanner(System.in);
        int chosenLoc = -1;
        boolean isValid = false;

        // Loop to validate input
        while (!isValid) {
            System.out.print("Choose a location (0-5): ");
            if (in.hasNextInt()) {
                chosenLoc = in.nextInt();
                if (chosenLoc >= 0 && chosenLoc <= 5) {
                    isValid = true;
                } else {
                    System.out.println("Invalid location. Please choose a number between 0 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                in.next();
            }
        }


        switch (chosenLoc) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("----Welcome to Safe House----");
                player.setHealth(player.hero);
                System.out.println("Your health is renewed.");
                playerLocation();
                break;
            case 2:
                toolStore();
                break;
            case 3:
                player.location = 3;
                handleLocation("Zombie", 1, 3, 10, 4);
                break;
            case 4:
                player.location = 4;
                handleLocation("Vampire", 2, 4, 14, 7);
                break;
            case 5:
                player.location = 5;
                handleLocation("Bear", 3, 7, 20, 12);
                break;
            default:
                System.out.println("Unexpected error.");
                break;
        }
    }


    private void handleLocation(String monsterType, int level, int damage, int health, int reward) {
        Scanner in = new Scanner(System.in);
        int numOfMonsters = numberOfMonsters();
        System.out.println("There is/are " + numOfMonsters + " " + monsterType + "/s in this area!!!");
        System.out.println("Please type 'f' to fight, 'e' to escape.");

        String choice;
        while (true) {
            choice = in.next();
            if (choice.equalsIgnoreCase("f")) {
                for (int i = 1; i <= numOfMonsters; i++) {
                    Character monster = new Character(monsterType + i, level, damage, health, reward);
                    fight(player, monster);
                }
                if(player.location == 3){
                    System.out.println();
                    System.out.println("Congrats!!! You killed all the monsters in Cave and you collected the prize Food.");
                    player.prizes[0] = "Food";
                }
                if(player.location == 4){
                    System.out.println();
                    System.out.println("Congrats!!! You killed all the monsters in Cave and you collected the prize Wood.");
                    player.prizes[1] = "Wood";
                }
                if(player.location == 5){
                    System.out.println();
                    System.out.println("Congrats!!! You killed all the monsters in Cave and you collected the prize Water.");
                    player.prizes[2] = "Water";
                }
                if(player.prizes[0] == "Food" && player.prizes[1] == "Wood" && player.prizes[2] == "Water"){
                    System.out.println();
                    System.out.println("----------CONGRATULATIONS!!! YOU WON THE GAME----------");
                    System.out.println("Do you want to play again?(y/n)");
                    String again = in.next();
                    if(again.equals("y")){
                        gameStart();
                    }
                    else System.exit(0);
                }
                break;
            } else if (choice.equalsIgnoreCase("e")) {
                playerLocation();
                return;
            } else {
                System.out.println("Invalid choice. Please type 'f' to fight or 'e' to escape.");
            }
        }

        playerLocation();
    }
    void gameStart() {
        player = new Player();
        System.out.println("-------Welcome-------");
        System.out.print("Please write your player name:");


        player.name= in.next();


        selectHero();

        playerLocation();




    }
}
