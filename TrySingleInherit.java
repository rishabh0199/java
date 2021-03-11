/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
class Bbdu{
    void studentsname(){
        System.out.println("names...");
    }
}
class Bca1 extends Bbdu{
    void studentrollno(){
        System.out.println("rollno...");
    }
}
class Btech extends Bca1{
    void subject(){
        System.out.println("subject...");
    }
}
public class TrySingleInherit {
    public static void main(String args[]){
        Bca1 oneone=new Bca1();
        oneone.studentsname();
        oneone.studentrollno();
                
       
               Btech one=new Btech();
               one.subject();
               
    }
            
    
}
