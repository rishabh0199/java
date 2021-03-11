
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
public class tryyyyyyyy {
    public static void main(String[] args) {
    System.out.println("Type two numbers");
    sum();
}

private static void sum(){
    int a = 0;
    int b = 0;
    Scanner scan = new Scanner(System.in);
    try {
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a+b);
    } catch (Exception ex) {
        System.err.println("Type numbers in correct format!");
        sum();
    }
}
    
}
