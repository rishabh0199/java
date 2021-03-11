import java.util.*;
class mall
{
    Scanner sc=new Scanner(System.in);
    int ch,ch1,ch2;
    void inputdata()
    {
        System.out.println("PRESS 1 FOR SHOOSE");
		System.out.println("PRESS 2 FOR CLOTHS");
		System.out.println("PRESS 3 FOR BEAUTY PRODUCTS");
		System.out.println("PRESS 4 HEALTH PRODUCTS");
		System.out.println("PRESS 5 FOR MOVIE");
		System.out.println("PRESS 6 FOR LOG OUT");
		 
		 do{
		 	ch=sc.nextInt();
		 	switch(ch)
		 	{
		 		
		 		case 1:
		 		System.out.println("THEIR ARE 200 OFF ON THE 2000 OR ITS ABOVE SHOOSE PURCHASING \n");
		 		System.out.println("PRESS 1 TO PURCHASE PUMA");
		 		System.out.println("PRESS 2 TO PURCHASE ADDIDAS");
                                System.out.println("PRESS 3 TO PURCHASE NIKE ");
		 		System.out.println("PRESS 10 TO GO BACK");
		 		

		 		
		 	    System.out.println("PLEASE CHOOSE YOUR CHOICE");
		 	    
		 	    do{
		 	    	ch1=sc.nextInt();
		 	    	switch(ch1)
		 	    	{
		 	    		case 1:
		 	    		System.out.println("YOU ARE PURCHASING PUMA");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}

		 	    		break;

		 	    		case 2:
		 	    		System.out.println("YOU ARE PURCHASING ADDIDAS");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;
		 	    		case 3:
		 	    		System.out.println("YOU ARE PURCHASING NIKE");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;

		 	    	}

		 	    }while(ch1==10);
		 		break;
		 	//???????not understanding	
		 		
		 		
		 	}
		 }while(ch==6);

	}

}
		 	    		public class Abc
		 	    		{
		 	    		    public static void main(String[] args)
		 	    		    {
		 	    		        mall w= new mall();
		 	    		        w.inputdata();
		 	    		    }
		 	    		}
		 	    		
