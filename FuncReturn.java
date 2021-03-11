/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstjavaprg;

/**
 *
 * @author my
 */

class Employee
{
    
    int id, attendance;
    String name;
    int bonus = 200;
    long salary;
 Employee(int i, String n, int atten, long sal)
 {
 this.id = i;
 this.name = n;
 this.attendance = atten;
 this.salary = sal;
 
 }
 
 long salaryBonus()
 {
 if (attendance >= 31)
 {
     long c = salary + bonus;
     return c;
 }
 return salary;
 
 }
 
 
 void empDetails()
 {
    System.out.println(id);
    System.out.println(name);
    System.out.println(salaryBonus());
 }


}



public class FuncReturn {
    
    public static void main(String args[])
    {
       Employee e = new Employee(1,"harendra", 31, 20000);
    e.empDetails();
    }
 
    
    
}
