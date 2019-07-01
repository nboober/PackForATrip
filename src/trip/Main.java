package trip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Closet closet = new Closet();

        String trip;

        do {
            System.out.println("\nYou have a 'casual' closet filled with casual clothes, a 'dressy' closet and a 'cowboy' closet. \nWhich closet would you like to open? When you are done, type 'finished'.");
            trip = scanner.next();

            if (trip.equalsIgnoreCase("casual")) {
                System.out.println(closet.getCasualCloset());
            } else if (trip.equalsIgnoreCase("dressy")) {
                System.out.println(closet.getDressyCloset());
            } else if (trip.equalsIgnoreCase("cowboy")) {
                System.out.println(closet.getCowboyCloset());
            }else if(trip.equalsIgnoreCase("finished")){
                continue;
            }else{
                System.out.println("That is not an option.");
            }

        } while(!trip.equalsIgnoreCase("finished"));
    }
}
