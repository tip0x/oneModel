public class one
{
public static void main(String[] args) 
    {
        //KILOMETERS TO MILES CONVERSION
        //DECLARATION
        double kilometer = 23; 
        double mile = 17;
        double kmRate = 0.621371; 
        double mRate = 1.609;
        
        //CONVERSION
        double miles = kilometer * kmRate; 
        double kilometers = mile * mRate;
        
        System.out.println("23 kilometers to miles = " + miles);
        System.out.println("17 miles to kilometers = " + kilometers);
    }
}