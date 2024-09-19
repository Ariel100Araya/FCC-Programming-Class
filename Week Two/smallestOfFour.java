// Week Two
// Ariel Araya-Madrigal
import java.util.Scanner;

public class smallestOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
