import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public static final int maxOccupancy=42;
    Scanner capture =new Scanner(System.in);
    public static void main(String []args){
        System.out.println("Welcome to the Train Booking System !");
    }
    public static void Login(){
        System.out.println("Enter the Station Code:");
        System.out.println("Enter the userName:");
        System.out.println("Enter the password");

        //reservation should be made before 30 days and picked up from a station
    }
    private static String[] add(){
        Database capture =new Database();
        System.out.println("Enter the User Name:");
        String name =capture.capture.nextLine();
        System.out.println("Enter the Seat No :"); //only one seat in one session
        String seat =capture.capture.next();
        String [] singleSeat={name,seat,"1"};
        return singleSeat;
    }

    private static void view(){

    }

    private static void empty(){

    }

    private static void
}

