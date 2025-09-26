
/**
 * Write a description of class three here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Fermat
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input a:");
        double a = s.nextDouble();
        System.out.print("Please input b:");
        double b = s.nextDouble();
        System.out.print("Please input c:");
        double c = s.nextDouble();
        System.out.print("Please input n:");
        double n = s.nextDouble();
        
        double one = Math.pow(a, n) + Math.pow(b, n);
        double two = Math.pow(c, n);
        
        if(one == two && n>2){
            System.out.println("Holy smokes, Fermat was wrong!");
        }else{
            System.out.println("No, that doesn't work");
        }
    }
}