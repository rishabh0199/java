
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
public class Em {
    
    
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a employee id");
       int id = sc.nextInt();
       System.out.println("Enter a employee name");
       String  name = sc.next();
       System.out.println("Enter a employee salary");
       double salary = sc.nextDouble();
      Data d = new Data(id,name, salary);
      d.getEmpDetails(); 
   }
           
    
}
class Data
{
    int id;
    String name;
    double salary;
    
    Data(int i, String n, double s)
    {
        id = i;
        name = n;
        salary = s;
        
    }
    
    
    void getEmpDetails()
    {
    System.out.println(id);
    System.out.println(name);
    System.out.println(salary);
    
    }
}