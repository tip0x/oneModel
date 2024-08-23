import java.text.DecimalFormat;

public class two {
        public static void main(String[] args) {
        //Declaration
        double m2 = 22;
        double m2Rate = 1000000;

        //CONVERSION
        double km2 = m2 / m2Rate;

        //OUTPUT FORMAT
        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println(m2 + " Square Meters is = " + df.format(km2) + " Square Kilometers");
    }
}

//Write a program to convert 22 SQM into SQKM
//Divide SQM by 1000000 to produce SQKM
//The answer is not zero