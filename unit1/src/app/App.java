package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's count from 10 to 20");
        
        for (int i = 10; i <= 20; i = i +1){
            System.out.println("The count is " +i);
            System.out.println("Let's keep counting.");
        }

        for (int i = 10; i <= 100; i = i +1){
            System.out.println("The count is " +i);
            System.out.println("Let's keep counting.");
        }

        System.out.println("Now let's do 1,000-256,000");

        for (int i = 1000; i <= 256000; i = i +1){
            System.out.println("The count is " +i);
            System.out.println("Let's keep counting.");
        }

        System.out.println("Now 11-12");

        for (int i = 11; i <= 12; i = i +1){
            System.out.println("The count is " +i);
            System.out.println("Let's keep counting.");
        }

        System.out.println("Now lets try something a bit different.");

        for (int i = 10; i <= 10; i = i -1){
            System.out.println("The count is " +i);
            System.out.println("Let's keep counting.");
        }

    }
}