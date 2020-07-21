import java.util.Scanner;
import java.util.*;
public class Mortgage {
	public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
         
        double principal = 0, rate, mort;
        int time = 0;
        System.out.println("Enter principal between 1000 and 1000000");
        System.out.println("Enter principal: ");
        principal = a.nextFloat();
        if(principal>=1000 && principal<=1000000)
        {
        System.out.print("principal: "+principal);
        
        }
        else
        {
        	System.out.println("enter valid number");
        }
      
        System.out.println("Enter rate: ");
        rate = a.nextFloat();
        System.out.println("Enter time between 1 to 30:");
        System.out.print("Enter time in year: ");
        time = a.nextInt();
        if(time>=1 && time<=30)
        {
        System.out.println("time period is:"+time);
        rate=rate/(12*100); 
        time=time*12; 
        }
        else {
        	System.out.println("Entered is invalid:");
        }
      
        mort= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Mortgage is = $"+mort+"\n");
                 
    }
}



