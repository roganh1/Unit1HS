package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int bal = 100;
        int pay;
        boolean win = false;

        System.out.println("Would you like to make a bet?");
        String makeBet = input.nextLine();

        if (makeBet.equals("yes")) {
            for (byte round = 1; round <= 10; round++) {
                for (byte bets = 1; bets <= 10; bets++) {
                    System.out.println("Round " + round);
                    System.out.println("Bet " + bets + "/10");
                    System.out.println("Would you like to make an inside or outside bet?");
                    String inOrOut = input.nextLine();

                    if (inOrOut.equals("inside")) {
                        System.out.println("Enter the number you would like to bet on");
                        int num = input.nextInt();
                        input.nextLine();

                        System.out.println("How much would you like to bet?");
                        int amount = input.nextInt();
                        input.nextLine();

                        System.out.println("You will bet " + amount + " on " + num);
                        
                        int rand = rnd.nextInt(37);

                        if (num == rand) {
                            pay = amount * 35;
                            System.out.println("You made $" + pay);
                            bal = bal + pay;
                        } else {
                            System.out.println("You lost $" + amount);
                            bal = bal - amount;
                        }
                    }

                    if (inOrOut.equals("outside")) {
                        System.out.println("Would you like to bet even, odd, black, or red?");
                        String typeCol[] = { "even", "odd", "black", "red" };
                        int black[] = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
                        int red[] = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
                        String type = input.nextLine();
                        int rand = rnd.nextInt();

                        System.out.println("How much would you like to bet?");
                        int amount = input.nextInt();
                        input.nextLine();

                        if (type.equals(typeCol[0])) {
                            System.out.println("You will bet " + amount + " on " + typeCol[0]);
                            if (rand % 2 == 1) {
                                win = true;
                            }
                            if (win == true) {
                                pay = amount * 2;
                                bal = bal + pay;
                            } else {
                                pay = bal - amount;
                                bal = pay;
                            }
                        }

                        if (type.equals(typeCol[1])) {
                            System.out.println("You will bet " + amount + " on " + typeCol[1]);
                            if (rand % 2 == 1) {
                                win = true;
                            }
                            if (win == true) {
                                pay = amount * 2;
                                bal = bal + pay;
                            } else {
                                pay = bal - amount;
                                bal = pay;
                            }
                        }

                        if (type.equals(typeCol[2])) {
                            System.out.println("You will bet " + amount + " on " + typeCol[2]);
                            for (byte i = 0; i < black.length; i++) {
                                if (rand == black[i]) {
                                    win = true;
                                }
                            }
                            if (win == true) {
                                pay = amount;
                                bal = bal + pay;
                            } else {
                                pay = bal - amount;
                                bal = pay;
                            }
                        }

                        if (type.equals(typeCol[3])) {
                            System.out.println("You will bet " + amount + " on " + typeCol[3]);
                            for (byte i = 0; i < red.length; i++) {
                                if (rand == red[i]) {
                                    win = true;
                                }
                            }
                            if (win == true) {
                                pay = amount;
                                bal = bal + pay;
                            } else {
                                pay = bal - amount;
                                bal = pay;
                            }
                        }
                    }
                    if (inOrOut.equals("no")) {
                        System.out.println("Your balance is $" + bal);
                        bets = 10;
                    }
                    if (makeBet.equals("no")) {
                        System.out.println("Game Over");
                        System.out.println("Your balance is $" + bal);
                        round = 10;
                        bets = 10;
                        break;
                    }
                    if (round > 10) {
                        System.out.println("Game over!");
                        System.out.println("Your balance is $" + bal);
                        break;
                    }
                    if (bets > 10) {
                        System.out.println("Your balance is $" + bal);
                        break;
                    }
                }
            }
        }
    }
}