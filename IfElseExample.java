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
public class IfElseExample {
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
        int number = sc.nextInt();
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
    
}
