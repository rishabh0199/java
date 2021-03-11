/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
// using constructor

class InitEx
{
    
    int id;
    String name;
    InitEx(int i, String n)
    {
        id = i;
        name = n;
//        System.out.println(id +" " + name);
        System.out.println("Hello");
    }
    
    void printData()
    {
    System.out.println(id);
    System.out.println(name);
    }
    
  
}


public class ConstEx {
    
    
    
    
    public static void main(String args[])
    {
       InitEx ex = new InitEx(10,"hello");
       ex.printData();
    }
    
}
