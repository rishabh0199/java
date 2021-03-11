/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
class BBd{
    
    BBd()
    {}
    BBd(int a, int b)
    {
        System.out.println(a+b);
    }
    String color = "red";
    void studentsname(){
        System.out.println("names...");
    }
    
    void hello(int salary){
       System.out.println(salary);
    }
}
class Bcaa extends BBd{
    Bcaa(){
         
        super(10,30);
    }
    String color = "white";
    void studentrollno(){
         System.out.println(color); 
         System.out.println(super.color);   
         System.out.println("rollno...");
    }
}
class Btec extends BBd{
    void subject(){
        super.hello(20);
        System.out.println("subject...");
    }
}
public class HirarichalInherit {
    public static void main(String args[]){
        Bcaa oneone=new Bcaa();
        oneone.studentsname();
        oneone.studentrollno();
                
       
               Btec one=new Btec();
               one.subject();
               
    }
            

    
    
}
