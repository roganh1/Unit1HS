package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean done = false;
        byte numIncorrect = 0;

        while (done == false) {
            System.out.println("What's the password?");

        Scanner input = new Scanner(System.in);
        String passwd = input.nextLine();

            if (numIncorrect < 3) {
                if (passwd.equals("Password")) {
                    System.out.println("Here's the secret message!");
                    done = true;
                } else {
                    System.out.println("Error");
                    System.out.println("Please try again");
                    numIncorrect++;
                }
            }

            if (numIncorrect >= 3) {
                System.out.println("You have exceeded the maximum number of tries");
                done = true;
            }
        }
    }
}