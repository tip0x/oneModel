import java.util.Scanner;

public class six {
    private static Scanner sc;
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
           
        // Prompt the user to input three integers
            System.out.print("Enter the first value: ");
            int x = sc.nextInt();
            
            System.out.print("Enter the second value: ");
            int y = sc.nextInt();
            
            System.out.print("Enter the third value: ");
            int z = sc.nextInt();
            
            // Using swap variable for sorting values
            int i;
            
            // Compare and swap to ensure x is the smallest
            if (x > y) {
                i = x;
                x = y;
                y = i;
            }
            
            if (x > z) {
                i = x;
                x = z;
                z = i;
            }
            
            // Compare and swap to ensure y is smaller than z
            if (y > z) {
                i = y;
                y = z;
                z = i;
            //block ends 
            }
            
            // Output the integers in ascending order
            System.out.println("The values in ascending order are: " + x + ", " + y + ", " + z);
        }
    }

