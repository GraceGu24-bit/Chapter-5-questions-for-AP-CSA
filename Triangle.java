
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input the first length: ");
        double a = s.nextDouble();
        
        System.out.print("Please input the second length: ");
        double b = s.nextDouble();
        
        System.out.print("Please input the third length: ");
        double c = s.nextDouble();
        
        if(a <=0 || b<= 0 || c<=0){
            System.out.println("You can't have negative lengths. Try again");
            return;
        }
        
        if( c >= a+b || b>=c+a  || a>=c+b){
            System.out.println("Not a triangle");
        }else{
            System.out.println("It's a triangle!");
        }
    }
}