package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to bird facts! Please choose a fact (1-5)");

        Scanner input = new Scanner(System.in);
        byte b = input.nextByte();

        if (b < 1) {
            System.out.println("Error");
        }

        if (b > 5) {
            System.out.println("Error");
        }

        if (b == 1) {
            System.out.println("Fact #1, birds can fly!");
        }

        if (b == 2) {
            System.out.println("Fact #2, birds have semi-hollow bones");
        }

        if (b == 3) {
            System.out.println("Fact #3, about 2/3 of all bird species are found in tropical rain forests");
        }

        if (b == 4) {
            System.out.println("Fact #4, there is over 9,500 species of birds");
        }

        if (b == 5) {
            System.out.println("Fact #5, a pelican's beak can hold up to 2.5 gallons at a time");
        }
    }
}