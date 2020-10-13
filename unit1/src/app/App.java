package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        byte uInput = input.nextByte();
        System.out.println("Please enter another number");
        byte uInput2 = input.nextByte();

        for (int count = uInput; count <= uInput2; count = count + 1) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }
    }
}