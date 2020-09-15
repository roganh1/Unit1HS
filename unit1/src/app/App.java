package app;

public class App {
    public static void main(String[] args) throws Exception {
        boolean livesInStMichael = true;
        char firstLetterOfName = 'R';
        byte age = 17;
        short avgNumberOfSteps = 20000;
        int myFavNum = 60000;
        long bigNum = 7000000;
        float pi = 3.14f;
        double rand = 4.54167535415875;

        System.out.println("Whats a random number?");
        System.out.println(rand);
        System.out.println("What are the first three digits of pi?");
        System.out.println(pi);
        System.out.println("Give me a big number");
        System.out.println(bigNum);
        System.out.println("What's my favorite number?");
        System.out.println(myFavNum);
        System.out.println("About how many steps do I take weekly?");
        System.out.println(avgNumberOfSteps);
        System.out.println("How old am I?");
        System.out.println(age);
        System.out.println("What's the first letter of my name?");
        System.out.println(firstLetterOfName);
        System.out.println("Do I live in St. Michael?");
        System.out.println(livesInStMichael);
    }
}