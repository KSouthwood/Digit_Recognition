package recognition;

import java.util.Scanner;

public class Menu {
    private static final int CHOICE_MIN = 1;
    private static final int CHOICE_MAX = 2;

    private void showMenu() {
        System.out.println("1. Learn the network");
        System.out.println("2. Guess a number");
    }

    protected int getChoice() {
        showMenu();
        int choice = Integer.MIN_VALUE;
        while (choice < CHOICE_MIN || choice > CHOICE_MAX) {
            System.out.print("Your choice: ");
            String input = new Scanner(System.in).nextLine();
            if (input.matches("\\d")) {
                choice = Integer.parseInt(input);
            }
        }
        return choice;
    }
}
