import java.lang.Math;
import java.util.Scanner;

class FeetPerMinute {
    
    public static double fpmFinder (double vp) {
        return 4004 * (Math.sqrt(vp));
    }
    
    public static void main(String[] args) {
        
        Scanner obj1 = new Scanner(System.in);
        
        System.out.println("Enter velocity pressure");
        
        double velocity = obj1.nextDouble();
        
        double fpm = fpmFinder(velocity);
        
        System.out.println("\nFPM is " + fpm);
    }
}
