import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public static final int maxOccupancy = 42;
    Scanner Capture =new Scanner(System.in); // instance

    public static void main(String[] args) {
        System.out.println("Welcome to the Train Booking System !");
        add();
        view();
        viewEmpty();
        remove();

    }

    private static void remove() {
    }

    private static void viewEmpty() {
        //Uses GUI to show case the empty seats
    }

    private static void view() {
        // this is where GUI comes to play.
    }

    private static String[] add() {
        System.out.println("Adding a User");
        System.out.println("Enter the user name : ");
        Database addCapturue= new Database(); //instances references
        String userName =addCapturue.Capture.next();
        System.out.println("Enter the Seat Number : ");
        String seatNumber =addCapturue.Capture.next();
        System.out.println("An Number is Generated"); //Incrementing Number
        String [] customerElement = new String [3];
        customerElement[0]=userName;
        customerElement[1]=seatNumber;
        customerElement[2]="1";
        return customerElement;
    }
    private static void finalStage(){
        //where the application hold last version of the data.
    }

    public static void Login() {
        System.out.println("Enter the Station Code:");
        System.out.println("Enter the userName:");
        System.out.println("Enter the password");

        //reservation should be made before 30 days and picked up from a station
    }
}