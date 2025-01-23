// Importing Java Util scanner and random classes 

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Creating String array for r, p, or s
        // Using computerMove to accept a randomized element of the String rps
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];  // Declaring rps and passing Random utility and rps length to give raandomization a value. It will give us an index of 0, 1, or 2 at Random

        // Now we need the move from the player - Inputing Scanner Util
        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while(true) {
            System.out.println("Please enter your move (r, p, or s)");
            playerMove = scanner.nextLine(); // This will get line of input from user via keyboard
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                break;
        }
        System.out.println(playerMove + "is not a valid move");

    }




}