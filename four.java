import java.text.DecimalFormat;

public class four {
    public static void main(String[]args){
        //DECLARE THE VARIABLES
        double E = 60; //CONVERSION RATE
        double sec = 2400; //SECONDS
        double min = sec / E; //MINUTES
        double hour = min / E; //HOURS
        //DECIMAL FORMAT
        DecimalFormat fm = new DecimalFormat("0.0");

        System.out.println(fm.format(sec) + " Second makes " +fm.format(min)+ " Minute");
        System.out.println(fm.format(min) + " Minute makes " +fm.format(hour) + " Hour");
    }
    
}
