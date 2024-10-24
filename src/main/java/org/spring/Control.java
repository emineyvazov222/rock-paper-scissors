package org.spring;

import java.util.Scanner;

public class Control {

    private final Scanner keyboard = new Scanner(System.in);

    private RockGame player1Model;
    private RockGame player2Model;

    public void start() {
        player1Model = getPlayerInput("Player1");
        player2Model = getPlayerInput("Player2");
        compare();
    }

    private RockGame getPlayerInput(String playerName) {
        while (true) {
            System.out.print(playerName + ", enter a value between 1 and 3: ");
            int value = keyboard.nextInt();
            if (value >= 1 && value <= 3) {
                return new RockGame(value, playerName);
            } else {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    private void compare() {
        int value1 = player1Model.getValue();
        int value2 = player2Model.getValue();

        //1-tash,  2-makas,  3-kagit

        if (value1 == value2) {
            System.out.println("It's a draw!");
        } else if ((value1 == 1 && value2 == 2) || (value1 == 2 && value2 == 3) || (value1 == 3 && value2 == 1)) {
            System.out.println("Congrats! " + player1Model.getPlayer() + " wins!");
        } else {
            System.out.println("Congrats! " + player2Model.getPlayer() + " wins!");
        }
    }
}
