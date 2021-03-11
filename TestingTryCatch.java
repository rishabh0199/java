
import java.util.Scanner;

public class TestingTryCatch {

    public static void main(String[] args) {
        
        
        System.out.println("Enter numbers: ");
        Scanner number = new Scanner(System.in);
        
        
        try{
        int first = number.nextInt();
        int second = number.nextInt();
        int c=first+second;
        System.out.println("sum of numbers="+c);
        }
        
        catch(Exception e){
        System.out.println("please enter a numbers only");}

    }
}      