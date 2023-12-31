package Adventure_Game;

import java.util.Scanner;

public class Game extends Player{
    Scanner in = new Scanner(System.in);
    Game(){
    }
    void gameStart(){
        System.out.println("-------Welcome-------");
        System.out.print("Please write your player name:");
        Player player = new Player();
        player.name = in.nextLine();

        String str[][] = {{"Character |", "ID |", "Damage |", "Health |", "Coin"},
                          {"-----------", "----", "--------", "--------", "----"},
                          {"Samurai   |", "1  |", "  5    |", " 21    |", " 15"},
                          {"Archer    |", "2  |", "  7    |", " 18    |", " 20"},
                          {"Knight    |", "3  |", "  8    |", " 24    |", " 5"},
        };

        for(String[] strings : str) {
            int j = 0;
            for(j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println("----------------------------------------------------");

        System.out.print("Please chose your character by writing its id number:");
        int chosenId = in.nextInt();

        System.out.println("Your player name: "+ player.name);

        switch (chosenId) {
            case 1 -> {
                player.hero = new Samurai();
                System.out.println(player.name + "'s hero is a Samurai");
            }
            case 2 -> {
                player.hero = new Archer();
                System.out.println(player.name + "'s hero is a Archer");
            }
            case 3 -> {
                player.hero = new Knight();
                System.out.println(player.name + "'s hero is a Knight");
            }
        }
        player.heroSpecs();

        System.out.println();
        System.out.println("########## MAP ##########");
        System.out.println();
        System.out.println("1- Safe House ---> This place is safe and there is no monster here.");
        System.out.println("2- Tool Store ---> You can buy weapon or armor.");
        System.out.println("3- Cave ---> Be careful! You may encounter zombies.");
        System.out.println("4- Forest ---> Be careful! You may encounter vampires.");
        System.out.println("5- River ---> Be careful! You may encounter bears.");
        System.out.println("0- Quit ---> Quit game.");
        System.out.println("Please choose where you want to go.");
        int environmentId = in.nextInt();

        switch (environmentId){
            case 1 -> {

            }
        }



    }

}
