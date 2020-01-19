package JavaLec3;
import java.util.Scanner;
public class Salaray {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        char ch = sc.next().charAt(0);
        double hra,da,allow,pf,totalSalary;       
        if(ch=='A')
        {
            hra=S*0.2;
            da=S*0.5;
            allow=1700;
            pf=S*0.11;
            totalSalary = S + hra + da + allow-pf;
            System.out.println(Math.round(totalSalary));  
        }
        else if(ch=='B')
        {
        	 hra=S*0.2;
             da=S*0.5;
            allow=1500;
            pf=S*0.11;
            totalSalary = S + hra + da + allow-pf;
            System.out.println(Math.round(totalSalary));        
        }
        else
        {
        	 hra=S*0.2;
             da=S*0.5;
            allow=1300;
            pf=S*0.11;
            totalSalary = S + hra + da + allow-pf;
            System.out.println(Math.round(totalSalary));               
        }
	}
}