package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a noun.");
        String noun1 = input.nextLine();
        System.out.println("Enter an adjective.");
        String adj1 = input.nextLine();

        System.out.println("The" + " " + noun1 + " " + "is" + " " + adj1 + ".");

    }
}