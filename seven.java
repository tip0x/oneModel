import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                "1 is Pawn\n" +
                "2 is Knight\n" +
                "3 is Bishop\n" +
                "4 is Rookie\n" +
                "5 is Queen\n" +
                "6 is King\n" +
                "Enter a value (1 to 6): ");
            int x = input.nextInt();

            //verify range
            if (x < 1 || x > 6) {
                System.out.println("Invalid: The range must be between 1 and 6.");
            } else {
                //cardface using switch-case statement
                switch (x) {
                    case 1:
                        System.out.println("Pawn");
                        break;
                    case 2:
                        System.out.println("Knight");
                        break;
                    case 3:
                        System.out.println("Bishop");
                        break;
                    case 4:
                        System.out.println("Rookie");
                        break;
                    case 5:
                        System.out.println("Queen");
                        break;
                    case 6:
                        System.out.println("King");
                        break;
           }
        }
    }
}
    
}

