
/**
 * Write a description of class Quadratic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Quadratic
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input a:");
        double a = s.nextDouble();
        System.out.print("Please input b:");
        double b = s.nextDouble();
        System.out.print("Please input c:");
        double c = s.nextDouble();
        
        if(a == 0.0){
            System.out.println("Are you trying to give me a linear equation? That's not a part of my job description.");
            return;
        }
        
        double mid = b*b - 4*a*c;
        
        if(mid < 0.0){
            System.out.println("No solution.");
            return;
        }
        
        if(mid == 0.0){
            System.out.println((b*-1)/(2*a));
            return;
        }
        
        double one = (b*-1 + Math.sqrt(mid))/(2*a);
        double two = (b*-1 - Math.sqrt(mid))/(2*a);
        
        System.out.println(one);
        System.out.println(two);
        
        
       
    }
}