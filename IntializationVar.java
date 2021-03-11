/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
//by reference variable
//by methods
//by constructor

class Addition
{
int id;
String name;

void add1()
{
System.out.println("Hello Kabaddi");
}

void sub(int a, String n)
{
   id= a;
   name = n;
}

}
public class IntializationVar {
    
    public static void main(String args[])
    {
          Addition add = new Addition();
          add.id =1; 
          add.name = "rishabh";
          add.add1();
          
          
          System.out.println(add.id);
          System.out.println(add.name);
          Addition add1 = new Addition();
          add1.sub(10, "harendra");
            System.out.println(add1.id);
          System.out.println(add1.name);
    }

    
}

