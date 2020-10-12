package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean done = false;
        byte num = 34;
        while (done == false) {
            System.out.println("Guess a number between 0-100");
            Scanner input = new Scanner(System.in);
            byte uInput = input.nextByte();

            if (uInput <= 33) {
                System.out.println("Higher");
            }

            if (uInput >= 35) {
                System.out.println("Lower");
            }

            if (uInput == num) {
                System.out.println("Correct!");
                done= true;
            }
        }
    }
}