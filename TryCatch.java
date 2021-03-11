
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        
        
        System.out.println("Enter first number: ");
        Scanner number = new Scanner(System.in);
        try{
        int first = number.nextInt();}
        catch(Exception e){
        System.out.println(e);
        }
        System.out.println("Enter second number: ");
        try{
        int second = number.nextInt();}
        catch(Exception e){
        System.out.println(e);
        }
        }
    }     