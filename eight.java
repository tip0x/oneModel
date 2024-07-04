
import java.math.BigInteger;
import java.util.Scanner;

public class eight {
    private static Scanner sc;
    public static void main(String[] args) {
        //initialize
        sc = new Scanner(System.in);
        System.out.print("Enter the square number (1 to 64): ");
        int x = sc.nextInt();
        int i = 1;

        //Check if range is correct
        if (x < 1 || x > 64) {
            System.out.println("Invalid: The square number must be between 1 and 64.");
            return;
        }
        // 1 grain on the first square
        BigInteger y = BigInteger.ONE; 
        if (x > 1) {
            do {
            y = y.multiply(BigInteger.valueOf(2));
            i++;
            } while (i < x);
        }

        // Output the result
        System.out.println("Number of grains on square " + x + ": " + y);
    }
    }