package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a color.");
        String color = input.nextLine();

        System.out.println("Please enter a number.");
        int num = input.nextInt();

        int total = 0;

        while (total < num) {
            System.out.println(color);
            total = total + 1;
        }

    }
}