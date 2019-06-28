package trip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Closet casual = new Closet();
        Closet dressy = new Closet();
        Closet cowboy = new Closet();

        String closet;

        do {
            System.out.println("\nYou have a 'casual' closet filled with casual clothes, a 'dressy' closet and a 'cowboy' closet. \nWhich closet would you like to open? When you are done, type 'finished'.");
            closet = scanner.next();

            if (closet.equalsIgnoreCase("casual")) {
                System.out.println(casual.getCasualCloset());
            } else if (closet.equalsIgnoreCase("dressy")) {
                System.out.println(dressy.getDressyCloset());
            } else if (closet.equalsIgnoreCase("cowboy")) {
                System.out.println(cowboy.getCowboyCloset());
            }else if(closet.equalsIgnoreCase("finished")){
                continue;
            }else{
                System.out.println("That is not an option.");
            }

        } while(!closet.equalsIgnoreCase("finished"));
    }
}
