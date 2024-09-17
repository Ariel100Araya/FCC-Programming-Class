import java.util.Scanner;
public class HelloScanner {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Ask for the user's first name
        System.out.println("Enter your first name:");
        String FirstName = scan.nextLine();

        // Ask for the user's Greeting
        System.out.println("Enter your desired greeting:");
        String Greeting = scan.nextLine();

        // Print the user's full name
        System.out.println(Greeting + ", " + FirstName + "!");
    }
}
