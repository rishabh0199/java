/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstjavaprg;

import java.util.Scanner;

/**
 *
 * @author my
 */
public class IfExample {
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter age");
       int age = sc.nextInt();
    if(age>18){  
        System.out.println("Age is greater than 18");  
    }  else{
        System.out.println("age is less than 18");
                }
}  
}  
    

