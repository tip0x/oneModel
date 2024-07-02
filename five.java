public class five {
    public static void main(String[]args){
        //CIRCUMFERENCE
        double radius = 7.5;
        final double pi = 3.14;
        double circumference, area;
        circumference = 2*pi*radius; 
        area = pi* Math.pow(radius, 2);
        System.out.println("The area of a circle is " +area);
        System.out.println("The circumference of a circle is " +circumference);
    }
    
}
