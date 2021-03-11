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
public class LeapYearExample {  
public static void main(String[] args) {    
   Scanner sc =new Scanner(System.in);   
   System.out.println("enter the year");
   int year = sc.nextInt();
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}  
    

