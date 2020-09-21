package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun.");
        String noun1 = input.nextLine();
        System.out.println("Enter an adjective.");
        String adj1 = input.nextLine();
        System.out.println("Enter another adjective.");
        String adj2 = input.nextLine();
        System.out.println("Enter a verb.");
        String verb1 = input.nextLine();
        System.out.println("Enter another verb.");
        String verb2 = input.nextLine();


        System.out.println("The" + " " + noun1 + " " + "is" + " " + adj1 + ".");
        System.out.println("The" + " " + noun1 + " " + "will" + " " + verb1 + " " + "then bounce" + " " + adj2 + ".");
        System.out.println("After bouncing" + " " + adj2 + "lly" + " " + "the" + " " + noun1 + " " + verb2 + ".");

    }
}