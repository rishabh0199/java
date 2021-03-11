
import java.util.Scanner;
public class TryCatchForm{

    public static void main(String[] args) {
        
        
        System.out.println("*********EMPLOYEE REGISTRATION FORM********");
        Scanner emp = new Scanner(System.in);
        
        try{
        System.out.println("first name of employee");    
        String firstname = emp.next();
        System.out.println("enter last name of employee");
        String lastname = emp.next();
        }
        
       catch (Exception e) {
       System.out.println(e);}
        
        try{
         System.out.println("enter id of employee");   
        int id = emp.nextInt();
        System.out.println("enter dob of employee");
        int dob = emp.nextInt();
        System.out.println("enter salary of employee");
        int salary = emp.nextInt();
        }
        
        catch(Exception e){
        System.out.println(e);}
    }
}      