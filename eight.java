
import java.math.BigInteger;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
 
        try (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter the square number (1 to 64): ");
        int x = sc.nextInt();

        if (x < 1 || x > 64) {
            System.out.println("Invalid: The square number must be between 1 and 64.");
            return;
        }

        BigInteger y = BigInteger.ONE; // 1 grain on the first square

        for (int i = 2; i <= x; i++) {
            y = y.multiply(BigInteger.valueOf(2));
        }

        // Output the result
        System.out.println("Number of grains on square " + x + ": " + y);
    }
    }
}

//i is current square
//x is square value
//y is rice grains on square