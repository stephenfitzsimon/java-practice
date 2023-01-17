import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class MedievalGame{

  /* Instance Variables */
  private Player player = new Player("PLAYER_NAME");

  /* Main Method */
  public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    MedievalGame game = new MedievalGame();

    game.player = game.start(console);

    game.addDelay(500);
    System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
    System.out.println(game.player);

    game.addDelay(1000);
    System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it.");
    game.save();

    game.addDelay(2000);
    System.out.println("We just saved your game...");
    System.out.println("Now we are going to try to load your character to make sure the save worked...");

    game.addDelay(1000);
    System.out.println("Deleting character...");
    String charName = game.player.getName();
    game.player = null;

    game.addDelay(1500);
    game.player = game.load(charName, console);
    System.out.println("Loading character...");

    game.addDelay(2000);
    System.out.println("Now let's print out your character again to make sure everything loaded:");

    game.addDelay(500);
    System.out.println(game.player);
  } // End of main

  /* Instance Methods */
  private Player start(Scanner console) {
    // Add start functionality here
    Player player;

    Art.homeScreen();

    System.out.println("Welcome to the game.    Enter 'y' to load a game, 'n' to create a new game: ");
    String answer = "";
    answer = console.nextLine().toLowerCase();

    while (true) {
        if (answer.equals("y") | answer.equals("n")) {
            break;
        } else {
            System.out.println("Please enter y or n: ");
            answer = console.nextLine().toLowerCase();
        }
    }
    if (answer.equals("y")) {
        System.out.println("Please enter character name: ");
        String charName = console.nextLine();
        player = load(charName, console);
    } else {
        System.out.println("Please enter a new character name: ");
        String charName = console.nextLine();
        player = new Player(charName);
    }

    return player;
  } // End of start

  private void save() {
    // Add save functionality here
    String filename = this.player.getName() + ".svr";
    try {
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream playerSaver = new ObjectOutputStream(fileOut);

        playerSaver.writeObject(this.player);
    } catch (IOException e) {
        System.out.println("Unable to save file.");
        System.out.println(e.toString());
    }
  } // End of save

  private Player load(String playerName, Scanner console) {
    // Add load functionality here
    Player loadedPlayer;
    try {
        FileInputStream filein = new FileInputStream(playerName + ".svr");
        ObjectInputStream playerLoader = new ObjectInputStream(filein);
        loadedPlayer = (Player) playerLoader.readObject();
    } catch (IOException | ClassNotFoundException e) {
        addDelay(1500);
        System.out.println("Unable to load file. Making a default player.");
        addDelay(2000);
        loadedPlayer = new Player(playerName);
    }

    return loadedPlayer;
  } // End of load

  // Adds a delay to the console so it seems like the computer is "thinking"
  // or "responding" like a human, not instantly like a computer.
  private void addDelay(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}