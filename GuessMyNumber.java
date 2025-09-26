
/**
 * Write a description of class two here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GuessMyNumber
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int r = (int) (Math.random() * 100) + 1;
        System.out.println("I have chosen a random number between . Please try to guess what it is.");
        
        int a = s.nextInt();
        if(a < r){
           System.out.println("You are low");
        }else if(a>r){
           System.out.println("You are high");
        }else{
           System.out.println("You got it!");
           return;
        }
        
        int b = s.nextInt();
        if(b < r){
           System.out.println("You are low");
        }else if(b>r){
           System.out.println("You are high");
        }else{
           System.out.println("You got it!");
           return;
        }
        
        int c = s.nextInt();
        if(c < r){
           System.out.println("You are low");
        }else if(c>r){
           System.out.println("You are high");
        }else{
           System.out.println("You got it!");
           return;
        }
        
        System.out.println("You never managed to guess the number");
        System.out.println("The number was "+ r);
    }
}