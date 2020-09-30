package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        byte score = 0;

        System.out.println("Do you want to take this quiz?");
        String answer1 = input.nextLine();

            if (answer1.equals("Yes")) {
                System.out.println("Nice, good for you");
                score++;
            } else {
                System.out.println("Why are you here?");
            }

        System.out.println("What's 10 / 5");
        String answer2 = input.nextLine();
            
            if (answer2.equals("2")) {
                System.out.println("Right!");
                score++;
            } else {
                System.out.println("Oops wrong answer");
            }

        System.out.println("What's my name?");
        String answer3 = input.nextLine();

            if (answer3.equals("Rogan")) {
                System.out.println("Right!");
                score++;
            } else {
                System.out.println("Oops wrong answer");
            }

        System.out.println("What language was this quiz written with?");
        String answer4 = input.nextLine();

            if (answer4.equals("Java")) {
                System.out.println("Right!");
                score++;
            } else {
                System.out.println("Oops wrong answer");
            }

        System.out.println("Was this quiz easy?");
        String answer5 = input.nextLine();

            if (answer5.equals("Yes")) {
                System.out.println("Right!");
                score++;
            } else {
                System.out.println("Oops wrong answer");
            }

        System.out.println(score + "/5");
        System.out.println((score/5.0)*100+"%");
    }
}