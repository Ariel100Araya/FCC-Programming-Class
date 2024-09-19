// Week Two
// Ariel Araya-Madrigal
import java.util.Scanner;

public class Act3AA7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("My favorite city is: ");
        String city = input.nextLine();
        System.out.printf("My favorite city has %s characters\n", city.length());
        System.out.printf("My favorite city in all caps is: %s\n", city.toUpperCase());
        System.out.printf("My favorite city in all lowercase is: %s\n", city.toLowerCase());
        System.out.printf("The last character in my favorite city is: %s\n", city.charAt(city.length() - 1));
    }
}
