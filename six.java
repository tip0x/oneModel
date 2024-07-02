import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in))
            //try-with-resources ensures that the end of
            //the block is auto closed to avoid resource leaks
        { 
            //starting of block
            // Prompt the user to input three integers
            System.out.print("Enter the first value: ");
            int x = input.nextInt();
            
            System.out.print("Enter the second value: ");
            int y = input.nextInt();
            
            System.out.print("Enter the third value: ");
            int z = input.nextInt();
            
            // Using swap variable for sorting values
            int swap;
            
            // Compare and swap to ensure x is the smallest
            if (x > y) {
                swap = x;
                x = y;
                y = swap;
            }
            
            if (x > z) {
                swap = x;
                x = z;
                z = swap;
            }
            
            // Compare and swap to ensure y is smaller than z
            if (y > z) {
                swap = y;
                y = z;
                z = swap;
            //block ends 
            }
            
            // Output the integers in ascending order
            System.out.println("The values in ascending order are: " + x + ", " + y + ", " + z);
        }
    }

}
