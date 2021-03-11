/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my
 */
class One
{

     void ones(){
     	System.out.println("Once");
     }

}

class Two extends One
{
   void ones()
   {
   	System.out.println("Once Games Begin");
   }

	void twos()
	{
		System.out.println("Twos");
	}
}
public class Poly_Riding_Ex {
    public static void main(String []args)
	{

		Two t = new Two();
		t.ones();

	}
    
}
